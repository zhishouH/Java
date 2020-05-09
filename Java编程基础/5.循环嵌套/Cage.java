public class Cage {
    public static void main(String[] args) {
        //定义一个变量x为鸡的数量，y为兔的数量，sum为鸡和兔的脚的数量；
        int x, y,sum;
        for(x = 0;x <= 35;x++){
            y = 35 - x;
            sum = 2*x + 4*(35-x);
            if(sum == 94){
                System.out.println("鸡：" + x + "只,兔：" + y + "只");
            }
        }

    }

}
