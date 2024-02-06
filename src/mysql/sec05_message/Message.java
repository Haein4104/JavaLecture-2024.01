package mysql.sec05_message;

import java.time.LocalDateTime;

public class Message {
	private int mid;				// private key. 다른 것과 유일하게 구분. 입력받는것
	private String content;			// 본문. 타이틀을 적을 수도 있어
	private String writer;			// 사용자
	private LocalDateTime modTime;	// 데이터가 입력되는 순간의 시각. 입력받는것
	private int isDeleted;			// 게시글이 삭제되었나.. 이외에도 여러 기능 추가 가능
	public Message() { }
	// for Insert
	public Message(String content, String writer) {
		this.content = content;
		this.writer = writer;
	}
	// for Update
	public Message(int mid, String content, String writer) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
	}
	// for Read
	public Message(int mid, String content, String writer, LocalDateTime modTime) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
	}
	public Message(int mid, String content, String writer, LocalDateTime modTime, int isDeleted) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
		this.isDeleted = isDeleted;
	}
	
	@Override
	public String toString() {
		return String.format("%d  %s  %s  %s", mid, content, writer, 
							modTime.toString().replaceAll("T", " ").substring(0, 16));
//		return "Message [mid=" + mid + ", content=" + content + ", writer=" + writer 
//				+ ", modTime=" + modTime.toString().substring(0, 19).replace("T", " ")
//				+ ", isDeleted=" + isDeleted + "]";
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDateTime getModTime() {
		return modTime;
	}
	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}