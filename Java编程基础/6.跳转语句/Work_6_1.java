package Work_6;

public class Work_6_1 {

	public static void main(String[] args) {
		//��Ϊż����ֻ��2����������������ֱ�ӽ�2�����
		System.out.print(2 + " ");
		out: for(int i = 3;i <= 100;i+=2) {
				for(int j = 2;j < i;j++) {
					if(i % j == 0) {
						continue out;
					}
				}
			System.out.print(i +" ");
			}
	}

}
