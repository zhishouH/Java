import java.util.*;
public class Circle extends Shape {

    double radius;

    public Circle(double radius , String name) {
        super(name);
        this.radius = radius;
    }
    public double calArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
