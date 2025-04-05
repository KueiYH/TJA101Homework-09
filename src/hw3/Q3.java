package hw3;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
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
		// 從矩陣中隨機取出6個數字
		int sixRandoms[] = new int[6]; // 創建一矩陣放入隨機提供的六個數字
		int i = 0;
		outer: while (i < 6) {
			int randIndex = (int) (Math.random() * numberWanted.length);
			int numberPicked = numberWanted[randIndex];
				if (numberPicked == 0) {
					continue;
				}
			for (int j = 0; j < i; j++) {
				if (sixRandoms[j] == numberPicked) {
					continue outer;
				}
			}
			sixRandoms[i] = numberPicked;
			System.out.println("昨天明牌報這支:" + numberPicked);
			i++;
		}
	}
}
