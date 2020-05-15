
public class Circle extends Shape {
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calArea() {
		return(3.14 * radius * radius);
	}
	
	public double calPerimeter() {
		return(2 * 3.14 * radius);
	}
	public Circle() {
		
	}
	public Circle(double radius ) {
		this.radius=radius;
	}
}
