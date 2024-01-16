package ch04_control;

public class Ex01_if {

	public static void main(String[] args) {
		// if 제어문
		int score = 60 + (int) (Math.random() * 41);	// 60 ~ 100
		if (score >= 80)
			System.out.println(score + "점은 평균 이상입니다.");
		else
			System.out.println(score + "점은 평균 미만입니다.");
		
		char grade;
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'D';
		System.out.println("score: " + score + ", grade: " + grade);
		
		// switch 제어문 기본 문법 구조
		switch(score / 10) { // switch(정수, 문자, 문자열)
		case 10:				// case 위치값1: 실행내용;
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		default:				// if제어문의 if-else에서 else에 해당
			grade = 'D';
		}
		System.out.println("score: " + score + ", grade: " + grade);
	}
}
