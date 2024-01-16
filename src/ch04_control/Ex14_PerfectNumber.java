package ch04_control;

public class Ex14_PerfectNumber {

	public static void main(String[] args) {
		/* 1~10000 
		int sum = 0;
		for (int i = 1; i < 10000; i++) { //체크해야할 수
		    for (int k = 1; k < i; k++) { // 나누는 숫자
		        if (i % k == 0) { // 약수인지 찾는거
		            if (i == k) // 자기자신일 때 루프 벗어나기
		                break;
		            sum += k; // 약수를 더하기
		        }
		    }
		    if (sum == i) // 완전수 여부
		        result.push(sum); // 결과에 완전수 추가
		    sum = 0; // 약수 합 초기화
		}
		System.out.println("result > " + result);		*/
		
		// tc
		for (int i = 2; i <= 10000; i++) {
//			int divSum = 0;
//			for (int k = 1; k < i; k++) { 
//		        if (i % k == 0)
//		        	divSum += k;
//			}
			int divSum = divisorsSum(i);
			if (i == divSum)
				System.out.println(i);		
		}
	}
	
	static int divisorsSum(int num) {
		int divSum = 0;
		for (int i = 1; i < num; i++)
			if (num % i == 0)
				divSum += i;
		return divSum;	
	}
}