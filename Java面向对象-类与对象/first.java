//什么是类，如何创建类
public class first {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "五花肉";
        dog.color = "棕色";
        dog.variety = "阿拉斯加";

        System.out.println("名字：" + dog.name + "，毛色：" +  dog.color +  "，品种：" +  dog.variety);

        dog.eat();
        dog.run();
    }
}
class Dog {
    String name;
    String color;
    String variety;

    void eat() {
        System.out.println("啃骨头。");
    }
    void run() {
        System.out.println("叼着骨头跑。");
    }
}
