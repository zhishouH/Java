import java.io.*;
public class Ch62 {
    public static void demo() {
        try {
            int a[] = new int[2];
            a[4] = 3;
            System.out.println("After handling exception return here?");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("捕捉数组下标越界异常。");
        } finally {
            System.out.println("---------------");
            System.out.println("finally");
        }
        System.out.println("No exception?");
    }
    public static void  main(String[] args) {
        demo();

    }
}
