package Work3;
import java.util.Scanner;

public class Work3_1 {
	
	 public static void main(String[] args) {
	  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("���������۳�����һ���������룺");
	  
		  int number1 = sc.nextInt(); //����۳�����һ���������룻
		  int number2 = 3500;  //�۳���׼��
		  int number3 = number1-number2; //Ӧ������˰�
		  
		  if(number3<1500){
		   double number4 = (double)number3 * 0.03;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else if(number3<4500){   
		   double number4 = (double)number3 * 0.10 - 105;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else if(number3<9000){   
		   double number4 = (double)number3 * 0.20 - 555;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else if(number3<35000){  
		   double number4 = (double)number3 * 0.25 - 1005;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else if(number3<55000){   
		   double number4 = (double)number3 * 0.30 - 2755;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else if(number3<80000){ 
		   double number4 = (double)number3 * 0.35 - 5505;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  }
		  else{  
		   double number4 = (double)number3 * 0.45 - 13505;
		   System.out.println("������:" + number1+",Ӧ��˰:" + number4);
		  } 
	}
}
