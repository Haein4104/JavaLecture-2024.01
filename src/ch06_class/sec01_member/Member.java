// 클래스의 구조

// 클래스 밖
package ch06_class.sec01_member; // package

import java.time.LocalDate; // import

public class Member { // public class 'A' : 파일 이름(A)과 동일해야함

// 클래스 안에 오는 것들
	// 필드, 멤버, 속성
	public String name;
	private LocalDate birthday;
	private String email;

	// 생성자(constructor) - deselect all : 빈 생성자
	public Member() {
	}

	// source - generate constructor using field
	public Member(String name, LocalDate birthday, String email) {
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}

	// 메소드(Method)
	public int getAge() {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		int age = (month > birthday.getMonthValue()
				|| (month == birthday.getMonthValue() && day > birthday.getMonthValue()))
						? year - birthday.getYear() - 1
						: year - birthday.getYear();
		return age;
	}

	// source - generate toString
	@Override
	public String toString() {
		return "Member [name=" + name + ", birthday=" + birthday + ", email=" + email + 
				", age=" + getAge() + "]";
	}

	public LocalDate getBirthday() { // 내부 클래스
		return birthday;

	}
	// source - generate getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}

class ExternalClass { // 외부 클래스. 99% 이상 쓸 가능성 X

}
