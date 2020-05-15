
public class Rectangle extends Shape {
	
	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calArea() {
		return (length * width);		
	}
	
	public double calPerimeter() {
		return ((2*length) + (2*width));
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
}
