public class Factorial {
//    用递归方式定义阶乘计算的方法calFactorial；
    static int calFactorical(int num) {
        if(num == 1) {
            return 1;
        }
        int sum =  calFactorical(num - 1);
        return sum * num;
    }
//    在main方法中定义一个整数m=3，调用calFactorial方法，计算3的阶乘，并将结果在屏幕上输出
    public static void main(String[] args) {
         int m = 3;
        System.out.println("自然数"+ m + "的阶乘为：" + calFactorical(3));
    }
}