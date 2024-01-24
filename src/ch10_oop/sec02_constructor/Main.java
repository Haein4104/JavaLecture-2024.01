package ch10_oop.sec02_constructor;

public class Main {

	public static void main(String[] args) {
		// Person 객체 
		Person person = new Person("james", 27);
		person.eat(); person.sleep();
		
		// Student 객체
		Student student = new Student("maria", 23, 1234);
		student.eat(); student.sleep();
		student.study();

	}

} 
