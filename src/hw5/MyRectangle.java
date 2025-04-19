package hw5;

public class MyRectangle {

	private double width;
	private double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		double area = width * depth;
		return area;
	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
