package ch10_oop.sec02_constructor;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + " 님이 맛점중입니다.");
	}
	void sleep() {
		System.out.println(name + " 님이 꿀잠중입니다.");
	}
}
