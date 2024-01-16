package ch04_control;
import java.util.Scanner;

public class Ex11_for {
	public static void main(String[] args) {
		// 1 ~ 100 까지의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) 
			sum += i;
		System.out.println("1에서 100까지의 합: " + sum);
		
		// 1 ~ 100 까지 홀수의 합
		int oddSum = 0;
		for (int i = 1; i <= 100; i+= 2) 
			oddSum += i;
		System.out.println("1에서 100까지 홀수의 합: " + oddSum);
		
		// 자기 자신을 제외한 약수의 합
		int divSum = 0, num = 24;
		for (int i = 1; i < num; i++) 
			if (num % i == 0)
				divSum += i;
		System.out.println(num + " 자신을 제외한 약수의 합 : " + divSum);
		
		
		/* 초기식 증감식에 여러개의 변수 사용 가능
	      for (int i = 1, k = 2; i * k < 10; i++, k++)
	          System.out.println("i= " + i + ", k= " + k);	*/
		
		// 사용자가 5회 입력한 문자열을 받아 공백 사이에 넣고 한 문자열로 만들어 출력
		Scanner scan = new Scanner(System.in);
		String text = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("입력> ");
			String line = scan.nextLine();
			text += line + " ";
		}
		scan.close();
		System.out.println(text);		
		
		 // 배열 만들기 :: Enhanced for loop
		String [] fruits = {"apple", "banana", "cherry"};
		for (String fruit: fruits)
			System.out.println(fruit);		
		
	}

}
