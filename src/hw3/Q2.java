package hw3;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！(0~100)");
		int x;
		long randomNumber = Math.round(Math.random() * 100);
		// 比較
		while (true) {
			x = sc.nextInt();
			if (x > randomNumber) {
				System.out.println("大於正確答案，再猜猜！");
			} else if (x < randomNumber) {
				System.out.println("小於正確答案，再猜猜！");
			} else {
				System.out.println("答對了！");
				break;
			}
		}
		sc.close();
	}
}
