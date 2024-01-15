package ch01_intro;

// class 이름(HelloWorld)은 대문자로 시작하며, 숫자는 먼저 올 수 없음
public class Ex01_HelloWorld {
	// public - 접근 제한자

	// /** : 도큐먼트 주석 - API document 만들 때 사용 (/* : 여러줄의 주석)
	
	// method 이름(main)은 소문자로 시작함
	// method가 종결되면 return이 원칙. 단, void는 제외
	public static void main(String[] args) {
		// syso, sysout 타이핑 후 ctrl + space 치면 System.out.println()이 생김
		System.out.println("Hello World!!!"); // 문장 마무리는 반드시 세미콜론(;)
		System.out.println("안녕하세요? " + "반가워요!");
		// 하나의 문자열만 올 수 있으나, 추가하려면 + 를 사용
		System.out.println();    		// ctrl + / : 문장을 커멘트 처리(토글)
		
	}
}
