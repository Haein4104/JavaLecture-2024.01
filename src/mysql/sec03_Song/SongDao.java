package mysql.sec03_Song;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * City DAO(Data Access Object) - DB table을 다루는 라이브러리
 * 		Select, Insert, Update, Delete 를 처리하는 프로그램
 */
public class SongDao {
	private String connStr;
	private String user;
	private String password;
	
	public SongDao() {
		String path = "C:/Workspace/Java/lesson/src/mysql/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));
			
			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection myConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Song getSongById(int sid) {
		Connection conn = myConnection();
		String sql = "select * from kcity where sid=?";
		Song song = new Song();			// 방법 1
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			
			// 셀렉트 실행하고 결과 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				song.setSid(rs.getInt(1));				// 방법 1
				song.setName(rs.getString(2));			// 방법 1
				song.setTitle(rs.getString(3));			// 방법 1
				song.setDebut(rs.getString(4));			// 방법 1
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}
	
	public Song getSongByName(String name) {
		Connection conn = myConnection();
		String sql = "select * from Song where name=?";
		Song song = null;				// 방법 2
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			// Select 실행하고 결과를 ResultSet으로 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getString(4));		// 방법 2
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}
	
	public List<Song> getCityListAll() {
		Connection conn = myConnection();
		String sql = "select * from Song";
		List<Song> list = new ArrayList<Song>();
		try {
			Statement stmt = conn.createStatement();
			// Select 실행하고 결과를 ResultSet으로 받기
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Song song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3), 
									 rs.getString(4));
				list.add(song);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Song> getSongByList(String songs) {
		Connection conn = myConnection();
		String sql = "select * from Song debut=?";
		List<Song> list = new ArrayList<Song>();
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, songs);
			// Select 실행하고 결과를 ResultSet에 담기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Song song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3), 
						 rs.getString(4));
				list.add(song);			
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	// insert
	public void insertSong(Song song) {
		Connection conn = myConnection();
		String sql = "insert into Song values(default, ?, ?, ?)";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getName());
			pstmt.setString(2, song.getTitle());
			pstmt.setString(3, song.getDebut());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// update
	public void updateSong(Song song) {
		Connection conn = myConnection();
		String sql = "update Song set name=?, title=?, debut=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getName());
			pstmt.setString(2, song.getTitle());
			pstmt.setString(3, song.getDebut());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteSong(int sid) {
		Connection conn = myConnection();
		String sql = "delete from Song where id=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<Song> getSongListAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}