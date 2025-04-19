package hw4;

import java.util.Random;

public class Q6 {

	public static void main(String[] args) {
		int[][] scores = { 
				// 8位學生6次考試的成績
				{ 10, 37, 100, 77, 98, 90 }, 
				{ 35, 75, 70, 95, 70, 80 }, 
				{ 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, 
				{ 90, 64, 75, 60, 75, 50 }, 
				{ 85, 75, 70, 75, 90, 20 },
				{ 85, 75, 70, 75, 90, 20 }, 
				{ 70, 95, 90, 89, 90, 75 } };
		// 每位學生最高分次數
		int[] maxScoreCount = new int[8]; 
		// 計算每次考試中誰最高分
		for (int j = 0; j < 6; j++) {
			int max = -1;
			int studentIndex = -1;

			//找出該次考試最高分的學生
			for (int i = 0; i < 8; i++) {
				if (scores[i][j] > max) {
					max = scores[i][j];
					studentIndex = i;
				}
			}
			// 學生編號j是最高分，count +1
			maxScoreCount[studentIndex]++;
		}
		// 印出最高分次數
		System.out.println("每位學生拿到最高分的次數：");
		for (int i = 0; i < 8; i++) {
			System.out.println("學生" + (i + 1) + "： " + maxScoreCount[i] + " 次");
		}
	}
}