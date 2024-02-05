package mysql.sec03_Song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongById(105);
		System.out.println(song);
		
		song = songDao.getSongByName("Gee");
		System.out.println(song);
		System.out.println("================================================");

		List<Song> list = songDao.getSongListAll();
		
		song = new Song(111, "원더걸스", "이 바보", "2007-02-10");
		songDao.insertSong(song);
		System.out.println(song);
		
		list.forEach(x -> System.out.println(x));
	}

}