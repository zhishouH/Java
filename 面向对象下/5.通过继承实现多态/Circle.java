public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calArea() {
        System.out.println("圆的面积：" + Math.PI * Math.pow(radius,2));
        return 0;
    }

    @Override
    double calPerimeter() {
        System.out.println("圆的周长：" + 2 * Math.PI * radius);
        return 0;
    }
}
