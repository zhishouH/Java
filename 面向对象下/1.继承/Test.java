
public class Test {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle();
		R1.setLength(2.0);
		R1.setWidth(2.0);
		System.out.println("�����ε����: " + R1.calArea());
		System.out.println("�����ε��ܳ�: " + R1.calPerimeter());
		
		Rectangle R2 = new Rectangle(3.0,5.0);
		System.out.println("�����ε����: " + R2.calArea());
		System.out.println("�����ε��ܳ�: " + R2.calPerimeter());
		
		System.out.println();
		
		Circle C1 = new Circle();
		C1.setRadius(2.5);
		System.out.println("Բ�����: " + C1.calArea());
		
		Circle C2 = new Circle(5.5);
		System.out.println("Բ���ܳ�: " + C2.calPerimeter());
	}

}
