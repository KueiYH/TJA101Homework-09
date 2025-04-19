package hw6;

public class Calculator {

	public Calculator() {
	}

	public static int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0 的 0 次方沒有定義！");
		}
		if (y < 0) {
			double result = Math.pow(x, y);
			if (result != Math.floor(result)) {
				throw new CalException("結果不是整數，請輸入非負整數的 y 值！");
			}
			return (int) result;
		}
		return (int) Math.pow(x, y);
	}
}