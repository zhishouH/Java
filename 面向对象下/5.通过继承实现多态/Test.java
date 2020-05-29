public class Test {
    public static void main(String[] args) {
        Calculator C1 = new Calculator();
        C1.calShape(new Circle(3.0));
        C1.calShape(new Rectangle(3.5,5.5));

        Calculator C2 = new Calculator();
        C2.calShape(new Circle(2.0));
        C2.calShape(new Rectangle(2.5,2.5));
    }
}
