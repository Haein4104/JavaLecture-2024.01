// 가장 높은 점수 출력
package ch17_collection.Quiz03_4;

import java.util.TreeSet;

import ch10_oop.sec02_constructor.Student;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.score);
		System.out.println("최고점수를 받은 ID : " + student.id);

	}

}
