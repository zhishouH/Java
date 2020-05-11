
public class Test {
	public static void main (String[] args) {
		MyTime one = new MyTime();
		one.setSecond(0);
		one.setMinute(0);
		one.setHour(0);
		System.out.println("第一次初始时分秒: " + one.toString());
		one.addSecond(2);
		System.out.println("addSecond: " + one.toString());
		one.addMinute(3);
		System.out.println("addMinute: " + one.toString());
		one.addHour(4);
		System.out.println("addHour: " + one.toString());
		one.subSecond(1);
		System.out.println("subSecond: " + one.toString());
		one.subMinute(1);
		System.out.println("subMinute: " + one.toString());
		one.subHour(1);
		System.out.println("subHour: " + one.toString());
		
		System.out.println();
		
		MyTime two = new MyTime();
		System.out.println("第二次初始时分秒: " + two.toString());
		two.addSecond(10);
		two.addMinute(10);
		two.addHour(10);
		System.out.println("第二次增加时分秒: " + two.toString());
		two.subSecond(2);
		two.subMinute(4);
		two.subHour(6);
		System.out.println("第二次减少时分秒: " + two.toString());
	}

}
