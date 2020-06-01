public class Dolphin extends Animal implements Swim{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Dolphin(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.print("海豚音！");
    }

    @Override
    public void swim() {
        System.out.print("游泳");
    }
}
