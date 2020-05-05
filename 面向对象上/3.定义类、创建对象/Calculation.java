
//在main方法中利用Trapezia类创建对象，计算梯形面积。

public class Calculation {
    public static void main(String[] args) {
        Trapezia one = new Trapezia();
        one.upperLength = 3.0;
        one.downLength = 4.0;
        one.height = 2.0;
        System.out.println(one.area());

        Trapezia two = new Trapezia();
        two.upperLength = 2.5;
        two.downLength = 3.5;
        two.height = 8;
        System.out.println(two.area());
    }
}
