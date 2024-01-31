package Quiz.Quiz01;

public class Sum {

	public static void main(String[] args) {
		// 1) 1에서 100까지 3의 배수의 합
//		int sum = 0;										// 정수형 변수 sum 선언 후 0으로 초기화
//		for (int i = 3; i <= 100; i+=3) 					// 1에서 시작해서 100에서 끝, 3씩 증가
//			sum += i;
//		System.out.println("1) 1에서 100까지 3의 배수의 합: " + sum);

		// 2) 1에서 20까지 홀수 제곱의 합
		int sum = 0;						// 정수형 변수 sum 선언 후 0으로 초기화

        for (int i = 1; i <= 20; i += 2) {  // 1에서 시작해서 20에서 끝, 2씩 증가(-> i 는 홀수)
            int square = i * i;				// 홀수 i 를 제곱해 square 변수에 저장
            sum += square;					// sum 변수에 제곱값(square 변수) 더하기 (-> 홀수의 제곱 누적)
        }

        System.out.println("1에서 20까지의 홀수 제곱의 합: " + sum);
		

	}

}
