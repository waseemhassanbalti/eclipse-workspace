package oopTask;

public class Shapes {
	
	public Shapes() {
		System.out.println("This is Shapes 1");
	}
	
	public Shapes(int x) {
		System.out.println("This is Shapes");
	}
	
	private double height;
	private double width;
	
	public int count = 1;
	
	public void setValues(double h, double w) {
		height = h;
		width = w;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public void display() {
		System.out.println("Count is "+ count);
	}
}
