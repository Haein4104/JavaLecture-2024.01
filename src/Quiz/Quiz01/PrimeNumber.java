// 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수인가를 판단하는 메소드 
//					Boolean isPrime(int num); 만들기
package Quiz.Quiz01;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("숫자 입력> ");
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        int num = Integer.parseInt(inputStr);
        scan.close();
        
        if (isPrime(num)) {
            System.out.println("결과> " + num + " 은/는 소수입니다.");
        } else {
            System.out.println("결과> " + num + " 은/는 소수가 아닙니다.");
        }
    }

    // 주어진 수가 소수인지를 판단하는 함수
    public static boolean isPrime(int number) {
        if (number < 2) {			// 2 미만의 수는 소수가 아님
            return false;
        }

        if (number == 2) {			// 2는 소수
            return true;
        }

        if (number % 2 == 0) {		// 2를 제외한 모든 짝수는 소수가 아님
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) { // 3부터 주어진 수(number)의 제곱근까지의 홀수(i += 2)
            if (number % i == 0) {						  // 로 나누어지지 않으면 소수
                return false;  // 나누어지면 소수가 아님
            }
        }

        return true;  // 나누어지지 않으면 소수
    }
}
