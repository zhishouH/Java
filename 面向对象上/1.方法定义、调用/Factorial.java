public class Factorial {

//    定义一个计算阶乘的方法calFactorial；
    static int calFactorial(int num) {
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum = sum * i;
        }
        return sum;
    }
//    在main方法中定义一个整数n=10，调用calFactorial方法，计算10的阶乘，并将结果在屏幕上输出；
//    在main方法中定义一个整数m=3，调用calFactorial方法，计算3的阶乘，并将结果在屏幕上输出。
    public static void main(String[] args) {
        int n = calFactorial(10);
        System.out.println("自然数10的阶乘为： " + n);
        int m = calFactorial(3);
        System.out.println("自然数3的阶乘为： " + m);
    }

}

