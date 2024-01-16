package ch04_control;

public class Ex12_While {

	public static void main(String[] args) {
		// 주사위 눈의 합이 15 이하면 계속 주사위를 굴리고, 초과시 탈출
		int diceSum = 0;
		while (diceSum <= 15) {
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
		}
		System.out.println(); System.out.println(diceSum);
		
		// 의도적으로 무한루프를 만들고 '탈출조건'을 루프 안에서 만들어줌
		diceSum = 0;
		while (true) {
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
			if (diceSum > 15)	// 탈출조건
				break;
		}
		System.out.println(); System.out.println(diceSum);
		
		// do - while : 한번은 무조건 수행
		diceSum = 0;
		do {
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
		} while (diceSum <= 15);
		System.out.println(); System.out.println(diceSum);
		
		
	}

}
