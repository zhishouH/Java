package Work_6;
import java.util.Scanner;
public class Work_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������: ");
		int number = sc.nextInt();
		for(int i = 1;i <= number;i++) {
			if(number % i == 0) {
				if( (number/i) < i) {
					break;
				}
				System.out.println(number+"="+(number/i) +"*"+ i);
			}
		}
	}

}
