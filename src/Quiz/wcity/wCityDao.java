package Quiz.wcity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class wCityDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public wCityDao() {
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

	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection myConnection() {
		conn = null;
		try {
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public wCity getCity(int id) {
		Connection conn = myConnection();
		String sql = "select * from city where id=?";
		wCity wcity = new wCity();
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			// 셀렉트 실행하고 결과 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				wcity.setId(rs.getInt(1));
				wcity.setName(rs.getString(2));
				wcity.setCountryCode(rs.getString(3));
				wcity.setDistrict(rs.getString(4));
				wcity.setPopulation(rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wcity;
	}

	// field는 table의 컬럼명, query는 검색어, num과 offset은 각각 limit와 offset 값
	public List<wCity> getwCityList(String field, String query, int num, int offset) {
		Connection conn = myConnection();
		String sql = "SELECT * FROM city"
	            + "   WHERE isDeleted=0 AND " + field + " LIKE ?"
	            + "   LIMIT ? OFFSET ?";

		List<wCity> list = new ArrayList<wCity>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+query+"%");
			pstmt.setInt(2, num);
			pstmt.setInt(3, offset);
			
			// Select 실행하고 결과를 ResultSet으로 받기
			ResultSet rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				wCity wcity = new wCity(rs.getInt(1), rs.getString(2), rs.getString(3), 
									 rs.getString(4), rs.getInt(5));
				list.add(wcity);
			}
			rs.close(); pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insertwCity(wCity wcity) {
		Connection conn = myConnection();
		String sql = "insert into city values(default, ?, ?, ?, ?)";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, wcity.getName());
			pstmt.setString(2, wcity.getCountryCode());
			pstmt.setString(3, wcity.getDistrict());
			pstmt.setInt(4, wcity.getPopulation());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatewCity(wCity wcity) {
		Connection conn = myConnection();
		String sql = "update city set name=?, countrycode=?, district=?, population=? where id=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, wcity.getName());
			pstmt.setString(2, wcity.getCountryCode());
			pstmt.setString(3, wcity.getDistrict());
			pstmt.setInt(4, wcity.getPopulation());
			pstmt.setInt(5, wcity.getId());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletewCity(int id) {
		Connection conn = myConnection();
		String sql = "delete from city where id=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
