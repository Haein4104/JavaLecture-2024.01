package ch05_reference;

public class Q4_연습문제 {

	public static void main(String[] args) {
	// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js 에서
		//		파일명 '04.String연습.js'만 출력
		String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		// split 후 맨 마지막 요소
		String[] pathArr = path.split("/");
		System.out.println(pathArr[pathArr.length - 1]);

	}

}
