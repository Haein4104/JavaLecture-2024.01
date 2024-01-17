package ch05_reference;
import java.util.Scanner;
public class Ex12_StringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요. 반갑습니다.";
		
		// String 길이 - 속성이 아니라 메소드임
		System.out.println(str1.length() + ", " + str2.length());		// 10, 13
		
		// 문자열 검색
		System.out.println(str2.charAt(0) + ", " + str2.charAt(7));		// 안, 반
		// System.out.println(str2[4]); <- 틀린 표현
		
		// 주민등록번호를 입력받아 성별 구별하기
	      Scanner scan = new Scanner(System.in);
	      String ssn = scan.nextLine();
	      scan.close();
	      char gender = ssn.charAt(7);
	      switch(gender) {
	      case '1': case '3':
	         System.out.println("남자"); break;
	      case '2': case '4':
	         System.out.println("여자"); break;
	      }
	   }
	}