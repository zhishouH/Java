public class Cat extends Animal implements Foot{
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    public Cat(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.print("喵喵喵！");
    }

    @Override
    public void foot() {
        System.out.print("四只脚走路");
    }
}
