package hw2;

public class Q1 {
	public static void main(String[] args) {
		int sum = 0;
		// 方法1
		for (int i = 1; i <= 500; i++) {
			sum = sum + 2 * i;
		}
		// 方法2
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
