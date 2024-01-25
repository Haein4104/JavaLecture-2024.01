/* HashCode()와 equals() 재정의
 * HashSet에 Student 객체를 저장하려한다. 학번이 같으면 동일한 Student라고 가정하고
 * 중복 저장되지 않도록 하고 싶다. Student 클래스에서 재정의해야하는 HashCode()와
 * equals() 메소드의 내용을 채워보세요. Student의 해시코드는 학번이라고 가정합니다.
*/
package ch17_collection.Quiz02;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNum == other.studentNum;
		
	}
}
