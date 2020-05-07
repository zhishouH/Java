public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Moon moon1 = Moon.getInstance();
        Moon moon2 = Moon.getInstance();

        System.out.println(moon1 == moon2);
    }
}
