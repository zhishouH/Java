public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    double calArea() {
        System.out.println("长方形的面积：" + width * length );
        return 0;
    }

    @Override
    double calPerimeter() {
        System.out.println("长方形的周长：" + 2 * (width + length));
        return 0;
    }
}
