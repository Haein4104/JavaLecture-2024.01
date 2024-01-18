package ch06_class.sec05_Melon;

public class Melon {
	public int rank;
	public String title;
	public String name;
	public String album;
	public String like;
	
	public Melon(int rank, String title, String name, String album, String like) {
		this.rank = rank;
		this.title = title;
		this.name = name;
		this.album = album;
		this.like = like;
	}

	@Override
	public String toString() {
		return "Melon [rank=" + rank + ", title " + title + ", name=" + name + ", album=" + album + ", like=" + like
				+ "]";
	}

}
