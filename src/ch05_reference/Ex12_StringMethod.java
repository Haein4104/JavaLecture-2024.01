package ch05_reference;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Ex12_StringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요. 반갑습니다.";

		// String 길이 - 속성이 아니라 메소드임
		System.out.println(str1.length() + ", " + str2.length()); // 10, 13
		/*
		 * // 문자열 검색 System.out.println(str2.charAt(0) + ", " + str2.charAt(7)); // 안, 반
		 * 
		 * // 주민등록번호를 입력받아 성별 구별하기 Scanner scan = new Scanner(System.in); String ssn =
		 * scan.nextLine(); scan.close(); char gender = ssn.charAt(7); switch(gender) {
		 * case '1': case '3': System.out.println("남자"); break; case '2': case '4':
		 * System.out.println("여자"); break; } System.out.println(str1.indexOf("Java") +
		 * ", " + str2.indexOf('반'));
		 */

		// 찾고자 하는 문자열이 대상 문자열에 있는지 확인
		if (str2.toLowerCase().indexOf("Java") >= 0)
			System.out.println("문장 안에 java라는 글자가 있습니다.");
		
		

		// 문자열 변환
		boolean a = true;
		int b = 123;
		double c = 3.14;
		char d = 'a';
		// 명시적 변환
		System.out.println(
				String.valueOf(a) + ", " + String.valueOf(b) + ", " + String.valueOf(c) + ", " + String.valueOf(d));
		// 암묵적 변환
		System.out.println(a + ", " + b + ", " + c + ", " + d);

		/* 문자열 배열 변환, 문자열 -> byte[], char[] */
		byte[] byteStr1 = str1.getBytes();
		byte[] byteStr2 = str2.getBytes(Charset.defaultCharset());
		System.out.println(Arrays.toString(byteStr1));
		System.out.println(Arrays.toString(byteStr2));

//	      문자열 내용 비교
		System.out.println(str1.equals("hello java")); // 문자열 비교시 == 사용하면 안됨
		System.out.println(str1.equalsIgnoreCase("hello java"));

	}
}