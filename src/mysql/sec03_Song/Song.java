package mysql.sec03_Song;

public class Song {

	private int sid;
	private String name;
	private String title;
	private String debut;
	
	public Song() {}

	public Song(int sid, String name, String title, String debut) {
		this.sid = sid;
		this.name = name;
		this.title = title;
		this.debut = debut;
	}

	@Override
	public String toString() {
		return "Song [sid=" + sid + ", name=" + name + ", title=" + title + ", debut=" + debut + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}
	
	
}
