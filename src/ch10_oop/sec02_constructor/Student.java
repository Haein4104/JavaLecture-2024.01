package ch10_oop.sec02_constructor;

public class Student extends Person {
	int studentId;

	public Student(String name, int age, int studentId) {
		super(name, age); // 부모의 생성자를 호출해야함
		this.studentId = studentId;
	}

	void study() {
		System.out.println(name + " 님이 열공중입니다.");
	}

}
