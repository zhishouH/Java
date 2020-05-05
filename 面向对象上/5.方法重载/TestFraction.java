public class TestFraction {
//    在main()方法中创建分数对象并调用相关方法来验证。
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fraction f1 = new Fraction();
        f1.setNumerator(1);
        f1.setDenominator(2);

        Fraction f2 = new Fraction();
        f2.setNumerator(1);
        f2.setDenominator(3);

        Fraction result = f1.add(f2);
        System.out.println(result.toString());

        Fraction result2 = f1.add(1, 4);
        System.out.println(result2.toString());

        Fraction result3 = f1.subtract(f2);
        System.out.println(result3.toString());

        Fraction result4 = f1.subtract(1, 4);
        System.out.println(result4.toString());
    }
}
