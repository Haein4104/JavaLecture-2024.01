package ch10_oop.sec01_person;

public class Main { 

	public static void main(String[] args) {
		// Person 객체
		Person person = new Person();
		person.name = "james"; person.age = 27;
		person.eat(); person.sleep();
		
		// Student 객체
		Student student = new Student();
		student.name = "maria"; student.age = 23; student.studentId = 1234;
		student.eat(); student.sleep(); student.study();
		
		// Worker 객체
		Worker worker = new Worker();
		worker.name = "jane"; worker.age = 30; worker.workerId = 5678;
		worker.eat(); worker.sleep(); worker.work();
				
			
	}

}
