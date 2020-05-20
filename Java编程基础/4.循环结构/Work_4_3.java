package Work_4;

public class Work_4_3 {

	public static void main(String[] args) {
	int j;
		for (j=1;j<=100;j++){
			double i = Math.random();
			if(i<0.5){
				System.out.println("第"+j+"次，  "+" i的值是"+i+",  结果为正面");
			}
			else{
				System.out.println("第"+j+"次,  "+" i的值是"+i+",  结果为反面");
			}
		}
	}

}
