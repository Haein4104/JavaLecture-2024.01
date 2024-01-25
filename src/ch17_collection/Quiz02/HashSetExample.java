// Student 중복 저장 방지
package ch17_collection.Quiz02;

import java.util.HashSet;
import java.util.Iterator;

import ch10_oop.sec02_constructor.Student;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "박해인"));
		set.add(new Student(2, "김동진"));
		set.add(new Student(1, "박해서"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}

	}

}
