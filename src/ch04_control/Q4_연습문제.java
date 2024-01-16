package ch04_control;

public class Q4_연습문제 {

	public static void main(String[] args) {
		// 다음 for문과 동일한 기능을 수행하는 while문을 작성하시오.
		
//		for(int i = 10; i > 0; i -= 2) {
//			System.out.println(i);
//		}
		
		int num = 10;
		
		while (num >= 2) {
			// 10 8 6 4 2 를 -출력- 하기
		System.out.println(num);
		num -= 2;
		System.out.println("마지막 계산" + num);
	
			
		}
		

	}
// break; = 연산을 끝내겠다
// continue; = 연산을 계속하겠다
}
