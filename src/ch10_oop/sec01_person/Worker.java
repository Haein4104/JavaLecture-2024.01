package ch10_oop.sec01_person;

public class Worker extends Person {
	int workerId;
	
	void work() {
		System.out.println(name + " 님이 회식에 초대되었습니다.");
	}
}
 