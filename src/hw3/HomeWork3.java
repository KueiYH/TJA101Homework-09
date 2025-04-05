package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {

//////////Q1.
//		//建立矩陣並取得數字
//		int x[] = new int[3];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入三個整數：");
//		//將數字填入矩陣
//		for (int i = 0; i < 3; i++) {
//			if (sc.hasNextInt()) {
//				x[i] = sc.nextInt();
//			}
//		}
//		Arrays.sort(x); //將邊長由小至大排序以便比較
//		int a = x[0];
//		int b = x[1];
//		int c = x[2];
//		//比較邊長並分類
////		三角形定義由嚴謹度排序:
////		正 > 等腰 > 直角 = 銳角 = 鈍角 > 普通
//		if (!(a + b > c)) {
//			System.out.println("不是三角形");
//		} else if (a == b && b == c) {
//			System.out.println("正三角形");
//		} else if (a == b || b == c) {
//			if (c * c > a * a + b * b) {
//				System.out.println("等腰鈍角三角形");
//			} else if (c * c == a * a + b * b) {
//				System.out.println("等腰直角三角形");
//			} else if (c * c < a * a + b * b) {
//				System.out.println("等腰銳角三角形");
//			} else {
//				System.out.println("等腰三角形");
//			}
//		} else if (c * c == a * a + b * b) {
//			System.out.println("直角三角形");
//		} else if (c * c > a * a + b * b) {
//			System.out.println("鈍角三角形");
//		} else if (c * c < a * a + b * b) {
//			System.out.println("銳角三角形");
//		} else {
//			System.out.println("普通三角形");
//		}
//		sc.close();
//////////Q2.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("開始猜數字吧！(0~100)");
//		int x;
//		long randomNumber = Math.round(Math.random() * 100);
//		// 比較
//		while (true) {
//			x = sc.nextInt();
//			if (x > randomNumber) {
//				System.out.println("大於正確答案，再猜猜！");
//			} else if (x < randomNumber) {
//				System.out.println("小於正確答案，再猜猜！");
//			} else {
//				System.out.println("答對了！");
//				break;
//			}
//		} sc.close();
//////////Q3.
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文選個不要的數吧");
		int numberUnwanted = sc.nextInt(); // 取得輸入的數字
		int count = 0;
		int numberWanted[] = new int[50]; // 創建一個矩陣放入篩選後的數字
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != numberUnwanted && i % 10 != numberUnwanted) {
				System.out.print(i + " ");
				numberWanted[i] = i;
				count++;
			}
		}
		sc.close();
		System.out.println("總共" + count + "個號碼可選");
//		從矩陣中隨機取出6個數字
		int sixRandoms[] = new int[7]; // 創建一矩陣放入隨機提供的六個數字

		outer: for (int i = 1; i <= 6; i++) {
			int randIndex = (int) (Math.random() * numberWanted.length);
			int numberPicked = numberWanted[randIndex];
			// 用另一個迴圈篩選隨機產生的數字避免重複，有重複就重新一次迴圈
			for (int j = 0; j < i; j++) {
				if (sixRandoms[j] == numberPicked) {
					continue outer;
				}
			}
			System.out.println("昨天明牌報這支:" + numberPicked);
		}
	}
}