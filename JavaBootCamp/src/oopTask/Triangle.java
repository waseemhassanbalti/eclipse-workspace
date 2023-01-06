package oopTask;

public class Triangle extends Shapes {
	
	public int count = 2;
	
	public Triangle() {
		System.out.println("This is triangle");
	}

	public double getArea() {
		return getHeight() * getWidth();
	}
	
	public void display(int x) {
		System.out.println("Count is "+ count);
	}
}
