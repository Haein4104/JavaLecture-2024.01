package ch06_class.sec01_member;

import java.time.LocalDate;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 생성
			// 초기 파라미터 없이 생성
		Member James = new Member();
			// 초기 파라미터 값을 주고 생성
		Member Ann = new Member("앤", LocalDate.of(2003, 1, 19), "Ann@gmail.com");
		
		// 필드 접근
		James.name = "제임스";					// 접근제한자가 Public -> 가능
//		James.email = "james@naver.com";		// 접근제한자가 Private -> Error
		James.setEmail("james@naver.com");
		James.setBirthday(LocalDate.of(1985, 9, 5));
		
		// 메소드 사용
		System.out.println(James);				// James.toString()
		System.out.println(Ann.toString());
		
		System.out.println(James.name + ": " + James.getBirthday() + ", " + James.getAge());
		System.out.println(Ann.name + ": " +  James.getBirthday() + ", " + Ann.getAge());
	}

}
