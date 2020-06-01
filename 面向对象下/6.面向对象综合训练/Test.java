public class Test {
    public static void  main(String[] args) {
       //定义一个数组animal
        // 然后用数组animal[0]=new Cat("Tom");
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




