package exercise2;
import java.util.Scanner;
public class ATM {
    public static void  main(String[] args){
        int my_money = 1000; //定义一个变量存储我的金额
        int cash = 0; //定义一个变量存储我要取得金额
        int is_get_cash = 0; //定义一个变量存储我是否继续取款得决定（‘1’：结束，‘2’：继续）
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用中国人民银行ATM取款机");
        do{
            System.out.println("输入取款金额：");
            cash = sc.nextInt();
            if(cash <= my_money){
                my_money = my_money - cash;
                System.out.println("您要取款的金额为：" + cash + "  您取款后的金额还剩：" + my_money);
            } else{
                System.out.println("目前金额" + my_money + "无法满足您的取款需求");
            }
            System.out.println("是否继续：‘1’：结束，‘2’：继续）" );
            is_get_cash = sc.nextInt();
            if(is_get_cash == 1){
                break;
            }
        }while(my_money > 0);
        System.out.println("取款结束！");
    }
}
