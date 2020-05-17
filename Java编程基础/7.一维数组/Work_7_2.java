package Work_7;
import java.util.Scanner;
public class Work_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请十个输入分数：");
		int[] Array = new int[10];
		int avg, sum = 0;
		int max = Array[0];
		int min = Array[0];
		for(int i = 0;i<Array.length;i++) {
			Array[i] = sc.nextInt();
			if(max < Array[i]) {
				max = Array[i];
			} 
			if(min > Array[i]) {
				min = Array[i];
			}
			sum = sum + Array[i];
		}
		sum = sum-max-min;
		avg = sum / 8;
		System.out.println("(去掉一个最高分和一个最低分)选手的平均得分："+avg);
	}

}
