package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入X、Y值");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		try {
			int result = Calculator.powerXY(x, y);
			System.out.println("結果是" + result);
		} catch(CalException e) {
			System.out.println(e.getMessage());
		}
	}
}
