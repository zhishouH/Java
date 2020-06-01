public class Crocodile extends Animal implements Foot,Swim{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Crocodile(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.print("呼噜呼噜！");
    }

    @Override
    public void foot() {
        System.out.print("用四只脚爬");
    }

    @Override
    public void swim() {
        System.out.print("游泳");
    }
}
