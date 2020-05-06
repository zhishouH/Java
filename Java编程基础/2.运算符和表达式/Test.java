public class Test {
    public static void main(String[] args) {
//        在main方法中定义整型变量x,y,z；x=3,y=4,z=5,编写程序计算以下表达式的值：
//        x3+y3+z3
//        x % 2 ==0
//        y%2==0 && z%2!=0
        int x = 3,y = 4,z = 5;
        System.out.println("(x3+y3+z3) = " + (x*x*x + y*y*y + z*z*z));
        System.out.println("(x % 2==0 ) = " + (x%2==0) );
        System.out.println("(y%2==0 && z%2!=0 ) = " + (y%2==0 && z%2!=0) );
    }
}
