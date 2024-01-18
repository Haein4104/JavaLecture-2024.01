package ch05_reference;

import java.util.Arrays;

public class Q1_NumberCount {

	public static void main(String[] args) {
		// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ..., 9는 몇번 사용되었는가?
		// 1234567890101112131415...9991000
		
		String numStr = "";
		for (int i = 1; i <= 1000; i++) {
		    numStr += i;
		}
		// 정규표현식 활용
		// [^3] : 3이 아닌 글자 (^ : not)
		for (int i = 0; i <= 9; i++) {
		    String numbers = numStr.replaceAll("[^" + i + "]", "");
		    int count = numbers.length();
		    System.out.println(i + ": " + count);
		}
		// 배열을 사용하여 숫자를 일일이 카운트
		int[] countArray = new int[10];		// [10] 대신 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}도 가능
		for (int i = 0; i <numStr.length(); i++) {	// 0부터 문자열 전체까지
		char num = numStr.charAt(i);		// '1', '2', '3', ... '0' 중 하나의 값을 '문자'로서 부름
		int numValue = num - '0'; 			// 1, 2, ..., 0 숫자 값
		countArray[numValue]++;
		}
		System.out.println(Arrays.toString(countArray));
	}

}
