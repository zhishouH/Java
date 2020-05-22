package Work3;

public class Work3_2 {
	
	public static void main(String[] args) {
		int month=7;
		  switch(month){
		  case 1:
		   System.out.println(month + "月有31天");
		   break;
		  case 2:
		   System.out.println(month + "月有29天");
		   break;
		  case 3:
		   System.out.println(month + "月有31天");
		   break;
		  case 4:
		   System.out.println(month + "月有30天");
		   break;
		  case 5:
		   System.out.println(month + "月有31天");
		   break;
		  case 6:
		   System.out.println(month + "月有30天");
		   break;
		  case 7:
		  case 8:
		   System.out.println(month + "月有31天");
		   break;
		  case 9:
		   System.out.println(month + "月有30天");
		   break;
		  case 10:
		   System.out.println(month + "月有31天");
		   break;
		  case 11:
		   System.out.println(month + "月有30天");
		   break;
		  case 12:
		   System.out.println(month + "月有31天");
		   break; 
		  default:
		   System.out.println("整型变量的值不符合要求");
		  }
	}
}
