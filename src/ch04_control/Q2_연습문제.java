package ch04_control;

public class Q2_연습문제 {

	public static void main(String[] args) {
		// Q1에서 완성한 코드를 동일한 기능을 수행하는 switch 구문으로 작성
		int score = 72;
		char grade;
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'D';
		
		switch(score / 10) {
		case 10:				
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		default:				
			grade = 'D';
		}
		System.out.println(grade + "학점");

	}

}
