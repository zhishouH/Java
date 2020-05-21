public class Test {
    public static void main(String[] args) {
        Shape one = new Square(2.0,2.0,"正方形");
        System.out.println( one.Name +"的面积：" + one.calArea());

        Shape two = new Circle(3.0 , "圆形");
        System.out.println( two.Name +"的面积：" + two.calArea());
    }
}
