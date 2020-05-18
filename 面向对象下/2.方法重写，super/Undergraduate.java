
public class Undergraduate extends Student {
	String specialty;
	public Undergraduate(String name , int age , String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	public String toString() {
		return  name + " -- " + age + " Ëê " + specialty;
	}
}
