package ch05_reference;

public class Q2_DigitalClock {

	public static void main(String[] args) {
		// 2. 디지털 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		int displayTime = 0;
		for (int hour = 0; hour <= 23; hour++) {
		    for (int minute = 0; minute <= 59; minute++) {
		        String timeStr = hour + ":" + minute;
		        if (timeStr.indexOf("3") >= 0)
		        	displayTime += 60;
		    }
		}
		System.out.println(displayTime + "초");   // 29700초

	}

}
