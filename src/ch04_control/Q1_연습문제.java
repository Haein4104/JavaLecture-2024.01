package ch04_control;

public class Q1_연습문제 {

	public static void main(String[] args) {
		/* 다음과 같이 점수(score)에 따라 학점이 부여되는 코드를
		 * 작성하고자 한다. if 선택제어문의 조건식을 완성해라
		 * (단, 0 <= score <= 100). 
		 * 값의 범위 ~ 출력 학점
		 * score >= 90 ~ A
		 * 80 <= score <= 90 ~ B
		 * 70 <= score <= 80 ~ C
		 * score < 70 ~ F
		 */
		
		int score = 72;
		if (score >= 80) {
			System.out.println("B학점");
		}
		else if (score >= 90) {
			System.out.println("A학점");
		}
		else if (score >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}

	}

}
