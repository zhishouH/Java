import java.util.*;
public class LianXi_Sort {
//    将给定的的三个整数进行由小至大排序。
    public static void  main(String[] args) {
//        定义三个整数x,y,z，将这三个整数由小到大排序并输出。数据由用户输入
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int temp;
        //如果x的值大于y那么x与y的值进行对调
        if(x > y){
           temp = y;
           y = x ;
           x = temp;
        }
        //将x与z对象对比，如果z比x小，那么x与z的值应该对调
        if(x > z){
            temp = z;
            z = x;
            x = temp;
        }
        //如上代码执行完毕之后，x的值就是最小的了  ，我们还需要将y与z进行对比
        if(y > z){
            temp = z;
            z = y;
            y = temp;
        }
        System.out.println("x: " +  x  + "  y: " + y + "  z: " + z);
    }
}
