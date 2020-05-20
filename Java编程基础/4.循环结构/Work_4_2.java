package Work_4;
import java.util.*;

public class Work_4_2 {

	public static void main(String[] args) {
		//随机生成一个10以内的数字
		int number1 = (int)(Math.random() * 10); 
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10以内的正整数：");
		int number2 =sc.nextInt();
		if(number1==number2){
			System.out.println("恭喜，中奖了！");
		}
		else{
			System.out.println("请重新输入：");
		}
		while(number1!=number2){
			number2 = sc.nextInt();
			if(number1==number2){
				System.out.println("恭喜，中奖了！");
			}
			else{
				System.out.println("请重新输入：");
			}
		}
	}
}
