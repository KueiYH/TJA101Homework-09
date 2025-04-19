package hw5;

public class Q3methods {

	public int maxElement(int x[][]) {
		int maxNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxNum < x[i][j]) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;

	}

	public double maxElement(double x[][]) {
		double maxNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxNum < x[i][j]) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
}
