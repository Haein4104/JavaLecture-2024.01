// Student 중복 저장 방지
package ch17_collection.Quiz02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		System.out.println(set.size());
		for (Student st: set)
			System.out.println(st);
	}

}