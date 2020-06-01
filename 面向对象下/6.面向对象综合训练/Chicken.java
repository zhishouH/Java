public class Chicken extends Animal implements Foot{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Chicken(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.print("咯咯咯！");
    }

    @Override
    public void foot() {
        System.out.print("两只脚走路");
    }
}
