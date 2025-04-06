package hw4;

public class Q1 {
	public static void main(String[] args) {
		int numbers[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			avg = sum / numbers.length;
		}
		System.out.println("平均為" + avg);
		System.out.print("大於平均的元素有:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > avg) {
				System.out.print(" " + numbers[i]);
			}
		}
	}
}
