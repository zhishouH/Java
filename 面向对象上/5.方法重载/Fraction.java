
//1、  创建“分数”类Fraction，定义分子、分母成员

public class Fraction {
    //	定义成员变量
    private int numerator; //分子
    private int denominator; //分母

    //	定义成员方法
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int n) {
        numerator = n;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int d) {
        denominator = d;
    }

//2、  定义二个分数运算方法add()以及subtract()各接收一个分数类型以实现分数与分数的加减运算。
    //分数相加
    public Fraction add (Fraction otherFra) {
        int commonDenominator = denominator * otherFra.denominator;
        int resultNumerator = numerator * otherFra.denominator + otherFra.numerator * denominator;

        Fraction resultFra = new Fraction();
        resultFra.setNumerator(resultNumerator);
        resultFra.setDenominator(commonDenominator);

        return resultFra;
}
    //分数相减
    public Fraction subtract (Fraction otherFra) {
        int commonDenominator = denominator * otherFra.denominator;
        int resultNumerator = numerator * otherFra.denominator - otherFra.numerator * denominator;

        Fraction resultFra = new Fraction();
        resultFra.setNumerator(resultNumerator);
        resultFra.setDenominator(commonDenominator);

        return resultFra;
    }

//3、  定义二个分数运算方法add()以及subtract()各接收两个int参数（分别代表分子和分母），以实现分数与分数的加减运算。
    //分数相加成员方法的重载
    public Fraction add (int num_otherFra , int deno_otherFra) {
        int commonDenominator = denominator * deno_otherFra;
        int resultNumerator = numerator * deno_otherFra + num_otherFra * denominator;

        Fraction resultFra = new Fraction();
        resultFra.setNumerator(resultNumerator);
        resultFra.setDenominator(commonDenominator);

        return resultFra;
}
    //分数相减成员方法的重载
    public Fraction subtract (int num_otherFra , int deno_otherFra) {
        int commonDenominator = denominator * deno_otherFra;
        int resultNumerator = numerator *deno_otherFra - num_otherFra * denominator;

        Fraction resultFra = new Fraction();
        resultFra.setNumerator(resultNumerator);
        resultFra.setDenominator(commonDenominator);

        return resultFra;
    }
//4、定义一个成员方法public String toString()，返回一个表示当前分数对象的字符串
    public String toString() {
        return numerator + "/" + denominator;
    }
}
