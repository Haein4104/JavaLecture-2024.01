package ch05_reference;

public class Q1_연습문제 {

	public static void main(String[] args) {
		// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ..., 9는 몇번 사용되었는가?
		// 1234567890101112131415...9991000
		
		String numStr = "";
		for (int i = 1; i <= 1000; i++) {
		    numStr += Integer.toString(i);
		}
		// 정규표현식 활용
		for (int i = 0; i <= 9; i++) {
		    let pattern = new RegExp("[^' + i + ']", 'g');
		    count = numStr.replace(pattern, '').length;
		    console.log(`${i}: ${count}`);
		}
	}

}
