package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		// 建立矩陣並取得數字
		int x[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		// 將數字填入矩陣
		for (int i = 0; i < 3; i++) {
			if (sc.hasNextInt()) {
				x[i] = sc.nextInt();
			}
		}
		//將邊長由小至大排序以便比較
		Arrays.sort(x);
		int a = x[0];
		int b = x[1];
		int c = x[2];
		//比較邊長並分類
		//三角形定義由嚴謹度排序: 正 > 等腰 > 直角 = 銳角 = 鈍角 > 普通
		if (!(a + b > c)) {
			System.out.println("不是三角形");
		} else if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (a == b || b == c) {
			if (c * c > a * a + b * b) {
				System.out.println("等腰鈍角三角形");
			} else if (c * c == a * a + b * b) {
				System.out.println("等腰直角三角形");
			} else if (c * c < a * a + b * b) {
				System.out.println("等腰銳角三角形");
			} else {
				System.out.println("等腰三角形");
			}
		} else if (c * c == a * a + b * b) {
			System.out.println("直角三角形");
		} else if (c * c > a * a + b * b) {
			System.out.println("鈍角三角形");
		} else if (c * c < a * a + b * b) {
			System.out.println("銳角三角形");
		} else {
			System.out.println("普通三角形");
		}
		sc.close();
	}
}
