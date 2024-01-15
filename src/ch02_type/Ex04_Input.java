package ch02_type;

import java.io.IOException;
import java.util.Scanner;

public class Ex04_Input {

	public static void main(String[] args) throws IOException {
		// 하나의 문자를 읽을 때 사용하나, 잘 안 씀
//		int keyCode = System.in.read();				// '5'
//		System.out.println("keyCode: " + keyCode);	// 0 x 35 => 3* 16 + 5 = 53
		
		var scan = new Scanner(System.in);
		System.out.print("입력하세요>");
		String inputText = scan.nextLine();			// Enter를 칠때까지의 문자열을 읽음
		System.out.println(inputText);

	}

}
