package Quiz.Quiz02;

import java.time.LocalDate;

public class Member {			// 속성 (모두 비공개)
	private int mid;			// id(mid) : 정수
	private String name;		// name : 문자열
	private int birthYear;		// 생년 : 정수
	private String tel;			// 전화번호 : 문자열
	
	public Member() {}			// 기본 생성자
	//	모든 속성값을 매개변수로 받아서 객체의 속성값을 설정하는 생성자
	public Member(int mid, String name, int birthYear, String tel) {
		this.mid = mid;
		this.name = name;
		this.birthYear = birthYear;
		this.tel = tel;
	}
	
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		LocalDate today = LocalDate.now();
		return today.getYear() - birthYear;
	}
	
//	Member를 출력하면 다음과 같이 나오게 해주는 메소드 (단, 나이는 금년 – 출생년)
//  ID: mid, 이름: name, 나이:ㅇㅇ, 전화번호: ㅇㅇㅇ-ㅇㅇㅇㅇ-ㅇㅇㅇㅇ
	@Override
	public String toString() {
		return "ID : " + mid + 
				", 이름: " + name + 
				", 나이: " + (LocalDate.now().getYear() - birthYear) + 
				", 전화번호: " + tel;
	}

}
