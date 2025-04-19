package hw5;

public class Q2 {
	public static void main(String[] args) {

		long numbers[] = new long[10];

		System.out.println("本次亂數結果:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.round(Math.random() * 100);
			System.out.print(numbers[i] + " ");
		}
		System.out.println("其平均為:" + Q2method.randAvg(numbers));
	}
}