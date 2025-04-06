package hw4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		// 取得輸入金額
		Scanner idInput = new Scanner(System.in);
		System.out.println("阿文你要借多少？");
		// 將輸入金額和同事現金比較
		int colleague[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int moneyNeeded = idInput.nextInt();
		int count = 0;
		int colleagueId[] = new int[5];
		for (int i = 0; i < colleague.length; i++) {
			if (moneyNeeded <= colleague[i][1]) {
				count += 1;
				colleagueId[i] = colleague[i][0];
			}
		}
		System.out.println("有錢可借的員工編號:");
		for (int i = 0; i < colleagueId.length; i++) {
			if (colleagueId[i] != 0) {
				System.out.print(colleagueId[i] + " ");
			}
		}
		System.out.println("共 " + count + " 人！");
		idInput.close();
	}
}
