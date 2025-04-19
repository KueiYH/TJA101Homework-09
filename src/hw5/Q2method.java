package hw5;

public class Q2method {

	public static long randAvg(long numbers[]) {
		long sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + numbers[i];
		}

		long avg = sum / 10;
		return avg;
	}
}