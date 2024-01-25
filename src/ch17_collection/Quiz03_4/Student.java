/* TreeSet에 Student 객체를 저장하려고 함. Student의 score 필드값으로 자동 정렬하도록
*  구현하고 싶다. TreeSet의 last() 메소드를 호출했을 때 가장 높은 score의 Student 객체가
*  리턴되도록 Student 클래스를 완성해보라.
*/

package ch17_collection.Quiz03_4;

public class Student implements Comparable {
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		// 코드 작성
		return 0;
	}
	

}
