## 以面向对象的思想设计动物园系统
>要求：
- 1、动物乐园中有猫、鸡等成员，还可以增加新成员。猫和鸡都有自己的名字，都会走路，但走路的方式不同，猫用“4只脚走路”，鸡用“2只脚走路”，猫和鸡会发出叫声，猫的叫声是“喵喵喵……”，鸡的叫声是“格格格……”。
提示：要定义哪些类；类中有哪些成员变量、成员方法；如何实现代码重用。

- 2、在系统中增加新成员海豚，该如何设计？海豚的叫声是“海豚音……”，注意：海豚不会走路，只会游泳

- 3、在系统中增加新成员鳄鱼，该如何设计？鳄鱼的叫声是“呼噜呼噜……”，注意：鳄鱼是两栖动物，既会爬（走路），又会游泳。

- 4、编写测试类，在main方法中定义数组，存储1只猫，1只鸡、1只海豚和1只鳄鱼，对数组进行遍历，输出猫、鸡、海豚和鳄鱼的名字和叫声。输出结果如下所示。
```
汤姆猫  喵喵喵
唐老鸡  咯咯咯
小海豚  海豚音
小鳄鱼  呼噜呼噜
```

- 5、对数组进行遍历，输出猫、鸡、海豚和鳄鱼的名字、移动方式和叫声。输出结果如下图所示。
```
动物名字    动物叫声    运动方式
汤姆猫      喵喵喵      四只脚走路
唐老鸡      咯咯咯      两只脚走路
小海豚      海豚音              游泳
小鳄鱼      呼噜呼噜    四只脚爬  游泳
```

>分析：
- 1、定义一个Animal抽象类，给类中定义一个私有成员变量name,定义set和get方法、构造方法，以及动物叫声的成员方法sound。
- 2、定义两个移动方式接口，一个为爬行方式，一个为游泳方式。
- 3、定义Cat、Chicken、Crocodile、Dolphin四个类继承于Animal,重写父类中的成员方法，包括set、get、构造方法、sound方法。
- 4、Cat、Chicken连接爬行方式接口；Dolphin连接游泳方式接口；Crocodile连接爬行与游泳接口；重写接口中的方法；
- 5、定义一个测试类(应用程序),在该类中定义一个数组存储动物名字，动物名字通过对象存储。遍历要求4中的内容；遍历要求5中的内容，其中使用instanceof运算符判断对象是否是子类对象。

>代码实现：
- Animal
```
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Animal(String name) {
        this.name=name;
    }
    abstract void sound();
}
```
- Cat
```
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
```
- Chicken
```
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
```
- Dolphin
```
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
```
- Crocodile
```
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
```
- Swim接口
```
public interface Swim {
    void swim();
}

```
- Foot接口
```
public interface Foot {
    void foot();
}
```
- 测试类(应用程序)
```
public class Test {
    public static void  main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Cat("汤姆猫");
        animal[1] = new Chicken("唐老鸡");
        animal[2] = new Dolphin("小海豚");
        animal[3] = new Crocodile("小鳄鱼");

        for(int i = 0 ; i < animal.length ; i++) {
            System.out.print(animal[i].getName() + "        ");
            animal[i].sound();
           System.out.println();
        }
        System.out.println();
        System.out.println("动物名字" + "   " + "动物叫声" + "      " + "移动方式");
        for(int j = 0 ; j < animal.length ; j++) {
           System.out.print(animal[j].getName() + "     ");
            animal[j].sound();
            System.out.print("      ");
           if(animal[j] instanceof Cat ){
              ((Cat)animal[j]).foot();
           } else if(animal[j] instanceof Chicken) {
                ((Chicken)animal[j]).foot();
           } else if(animal[j] instanceof  Dolphin) {
               System.out.print("             ");
               ((Dolphin)animal[j]).swim();
           } else {
               ((Crocodile)animal[j]).foot();
               System.out.print("  ");
               ((Crocodile)animal[j]).swim();
           }
           System.out.println();
        }

      }
}
```
