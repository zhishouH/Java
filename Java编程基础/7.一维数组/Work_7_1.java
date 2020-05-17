package Work_7;

public class Work_7_1 {

	public static void main(String[] args) {
		int[] Array1 = new int[10];
		Array1[0] = 1;
		Array1[1] = 1;
		int sum = 2;
		for(int i = 2;i<Array1.length;i++) {
			Array1[i] = Array1[i-1] + Array1[i-2];
			sum = sum + Array1[i];
		}
		System.out.println("Fibonacci数列的前十项和为："+sum);
	}
}

