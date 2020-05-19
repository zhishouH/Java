package Woek_8;
import java.util.Scanner;
public class Work_8_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入杨辉三角的层数： ");
		int number = sc.nextInt();
		int[][] arr = new int[number][];
		for (int i = 0; i < number; i++) {
			arr[i] = new int [i + 1];
			for (int j = 0; j <= i; j++) {
				arr[i][j] = 1;
				if (j == i) {
					arr[i][j] = 1;
				} else if (j > 0) {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + "  ");
				if(j == i) {
					System.out.println();
				}
			}
		}
	}
}
