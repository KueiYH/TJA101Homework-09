package hw5;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		// 取得數字
		Scanner input = new Scanner(System.in);
		System.err.println("請輸入邊寬");
		int width = input.nextInt();
		System.out.println("請輸入高");
		int height = input.nextInt();
		input.close();

		// 呼叫方法印出星星
		Q1method.starSquare(height, width);
	}
}
