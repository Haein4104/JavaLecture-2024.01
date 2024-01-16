package ch04_control;

import java.util.Scanner;

public class Ex05_Test_Alarm_1 {

	public static void main(String[] args) {
		// 알람시계 : 알람 시각/분을 입력받아 45분 이전의 알람 시각
		// int hour = 6, minute = 30;
		
		  Scanner scan = new Scanner(System.in);
	      System.out.print("시간 입력 > ");
	      int hour = Integer.parseInt(scan.nextLine());
	      System.out.print("분 입력 > ");
	      int min = Integer.parseInt(scan.nextLine());
	      	System.out.printf("%d, %d\n", hour, min);
	      scan.close();
	      	
		int newHour = 0, newMin = 0;		// 적용 시각
		if (min >= 45) {
			newHour = hour;
			newMin = min - 45;
		} else {
			if (hour == 0) {
			newHour = 23;
			newMin = min + 60 - 45;
			} else {
			newHour = hour - 1;
			newMin = min + 60 - 45;
			}
		}
		System.out.println(hour + "시 " + min + "분 --> " + newHour + "시 " + newMin + "분");

		//Refactoring
		newHour = hour; newMin = min - 45;
		if (min < 45) {
			newMin = min + 60 - 45;
			newHour = (hour % 24 == 0) ? 23 : hour - 1;
		}
	}

}
