package ch05_reference;

public class Q2_연습문제 {

	public static void main(String[] args) {
		// 2. 디지털 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		let displayTime = 0;
		for (let hour = 0; hour <= 23; hour++) {
		    for (let minute = 0; minute <= 59; minute++) {
		        let clock = hour + ':' + minute;
		        if (clock.indexOf('3') >= 0)
		            displayTime += 60;
		    }
		}
		console.log(`하루동안 3이 표시되는 시간은 ${displayTime}초 입니다.`);   // 29700 초

	}

}
