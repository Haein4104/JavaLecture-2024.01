package ch04_control;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03_FullAge {
		// 생년월일 입력하기
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
//		System.out.printf("%d, %d, %d%n", year, month, day);		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("생년> ");
			int bYear = Integer.parseInt(scan.nextLine());
			System.out.println("생월> ");
			int bMonth = Integer.parseInt(scan.nextLine());
			System.out.println("생일> ");
			int bDay = Integer.parseInt(scan.nextLine());
			System.out.printf("%d, %d, %d%n", bYear, bMonth, bDay);
			
			int age;
			  if (month > bMonth)
			     age = year - bYear;
			  else if(month > bMonth)
			     age = year - bYear - 1;
			  else {
			     if (day <= bDay)
			        age = year - bYear;
			     else
			        age = year - bYear - 1;
			  }
			  System.out.println("만 나이 : " + age);
			  
			  //Refactoring
			  int age2 = year - bYear;
			  if (month > bMonth || (month == bMonth && day > bDay))
			     age2--;
			  System.out.println("만 나이 : " + age2);
			  
			  int age3 = (month > bMonth || (month == bMonth && day > bDay)) ? year - bYear - 1 : year - bYear;
			  System.out.println("만 나이 : " + age3);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
			
	}