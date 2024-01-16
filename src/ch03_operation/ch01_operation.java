package ch03_operation;

public class ch01_operation {

	public static void main(String[] args) {
		int i = 2, k = 3;
		double f = k / (double) i;
		System.out.printf("%d, %d, %d%n", k/i, i++, --k); // 1, 2, 2
		System.out.printf("%f, %d, %d%n", f, i++, --k);		// 1.5, 3, 1
		
		char c = '안';
		System.out.println(c == '안'); // '=='은 primitive type의 값 비교에 쓰임
		String s = "Hello";
		System.out.println(s == "Hello");	// 참조형에선 저장위치 같은지를 물어보는 코드
		System.out.println(s.equals("Hello"));	// 참조형의 올바른 방법
		
		/* System.out.println(a == b == c); // 안됩니다. */
		System.out.println(i == k && k == 4);
		
		//논리식1 && 논리식2  논리식 1이 false
		//논리식1 \\ 논리식2  논리식 1이 true
		
		// 성적이 70점 이상이면 합격, 아니면 불합격
		int score =  40 + (int) (60 * Math.random());	// 이 값은 40~99까지
		char grade = score >= 70 ? '급' : '낙';
		System.out.printf("%d, %c%n", score, grade);
		
	}
}
