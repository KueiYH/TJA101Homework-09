package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle x = new MyRectangle();
		MyRectangle y = new MyRectangle(10, 20);

		x.setWidth(10);
		x.setDepth(20);
		System.out.println(x.getArea());
		System.out.println(y.getArea());
	}
}
