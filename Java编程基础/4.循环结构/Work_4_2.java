package Work_4;
import java.util.*;

public class Work_4_2 {

	public static void main(String[] args) {
		//�������һ��10���ڵ�����
		int number1 = (int)(Math.random() * 10); 
		Scanner sc = new Scanner(System.in);
		System.out.println("������10���ڵ���������");
		int number2 =sc.nextInt();
		if(number1==number2){
			System.out.println("��ϲ���н��ˣ�");
		}
		else{
			System.out.println("���������룺");
		}
		while(number1!=number2){
			number2 = sc.nextInt();
			if(number1==number2){
				System.out.println("��ϲ���н��ˣ�");
			}
			else{
				System.out.println("���������룺");
			}
		}
	}
}
