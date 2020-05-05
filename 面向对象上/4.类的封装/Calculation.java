
//在main方法中利用Trapezia类创建对象，计算梯形面积。

public class Calculation {
    public static void main(String[] args) {
        Trapezia one = new Trapezia();
        one.setUpperLength(10.0);
        one.setDownLength(5.0);
        one.setHeight(3);
        System.out.println(one.area());
    }


}
