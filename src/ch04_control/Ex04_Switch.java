package ch04_control;

public class Ex04_Switch {

	public static void main(String[] args) {
		String s = "hi";
		System.out.println(s.equals("hi"));
		
		switch(s) {		// switch/case 에서는 문자열 사용 가능
		case "Hi":
			System.out.println(true); break;
		case "hi":
			System.out.println("대소문자구분"); break;
		default:
			System.out.println(false);
		
		}
	}
}
