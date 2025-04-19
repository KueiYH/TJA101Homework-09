package hw4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("請輸入年分");
		int year = input.nextInt();

		System.out.println("請輸入月分");
		int month = input.nextInt();

		System.out.println("請輸入日期");
		int date = input.nextInt();

		input.close();

		System.out.println("你輸入的日期為" + year + "/" + month + "/" + date);

		int commonYearDays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int leapYearDays[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = 0;
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			for (int i = 0; i < month - 1; i++) {
				days += leapYearDays[i];
			}
		} else {
			for (int i = 0; i <= month - 1; i++) {
				days += commonYearDays[i];
			}
			
			days += date;
			System.out.println("是該年的第:" + days + "天");
		}
	}
}