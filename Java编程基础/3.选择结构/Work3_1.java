package Work3;
import java.util.Scanner;

public class Work3_1 {
	
	 public static void main(String[] args) {
	  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入您扣除三险一金后的月收入：");
	  
		  int number1 = sc.nextInt(); //输入扣除三险一金后的月收入；
		  int number2 = 3500;  //扣除标准；
		  int number3 = number1-number2; //应纳所得税额；
		  
		  if(number3<1500){
		   double number4 = (double)number3 * 0.03;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else if(number3<4500){   
		   double number4 = (double)number3 * 0.10 - 105;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else if(number3<9000){   
		   double number4 = (double)number3 * 0.20 - 555;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else if(number3<35000){  
		   double number4 = (double)number3 * 0.25 - 1005;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else if(number3<55000){   
		   double number4 = (double)number3 * 0.30 - 2755;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else if(number3<80000){ 
		   double number4 = (double)number3 * 0.35 - 5505;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  }
		  else{  
		   double number4 = (double)number3 * 0.45 - 13505;
		   System.out.println("月收入:" + number1+",应缴税:" + number4);
		  } 
	}
}
