public class Square extends Shape {

    double width;
    double length;

    public Square(double width , double length , String name) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double calArea() {
        return width * length;
    }
}
