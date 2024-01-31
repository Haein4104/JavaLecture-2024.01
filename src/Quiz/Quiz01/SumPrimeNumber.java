// 3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합 구하기
package Quiz.Quiz01;

public class SumPrimeNumber {
	public static void main(String[] args) {
		int sum = 0;
		for (int number = 2; number <= 100; number++)
			if (isPrime(number)) {
				sum += number;
			}
		System.out.println("2부터 100까지의 소수의 합> " + sum);
	}

	// 주어진 수가 소수인지를 판단하는 함수
	public static boolean isPrime(int number) {
		if (number < 2) { // 2 미만의 수는 소수가 아님
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) { // 2부터 주어진 수(number)의 제곱근
			if (number % i == 0) { // 로 나누어지지 않으면 소수
				return false; // 나누어지면 소수가 아님
			}
		}

		return true; // 나누어지지 않으면 소수
	}
}
