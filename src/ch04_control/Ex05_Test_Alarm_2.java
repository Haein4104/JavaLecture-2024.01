package ch04_control;

import java.util.Scanner;

// 알람시계: 알람 시각/분을 입력받아 45분 이전의 알람 시각
public class Ex05_Test_Alarm_2 {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner scan = new Scanner(System.in);
      System.out.print("4글자로 시간 입력>  ");
      int allHour = Integer.parseInt(scan.nextLine());
      int H = (int) Math.floor(allHour / 100);
      int M = (int) Math.floor(allHour % 100);

      System.out.println("입력받은 시간: " + H + "시 " + M + "분");

      if (M < 45) {
         M = 60 - 45 + M;
         H--;
      } else
         M -= 45;

      if (H < 0)
         H = 23;

      System.out.println("조정된 시간: " + H + "시 " + M + "분");
   }
}