package Woek_8;

public class Work_8_2 {

	public static void main(String[] args) {
		int[][] arr1 = { {1,2,3},{11,12,13} };
		int[][] arr2 = { {4,5,6},{7,8,9} };
		for (int i = 0;i <= 1; i++) {
			System.out.print("|");
			for (int j = 0; j <= 2; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] +" ");
			}
			System.out.println("|");
		}
	}

}
