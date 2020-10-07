public class Demo4 {
    public static void main(String[] args) {
//        // 定义一个基本数据类型的变量a，并赋值为20
//        int a = 20;
//        // 自动装箱：将基本数据类型的变量a赋值给Integer类型的变量b
//        Integer b = a;
//        System.out.println(b);
//        // 自动拆箱：将Integer类型的变量b赋值给基本类型的变量c
//        int c = b;
//        System.out.println(c);

            int num = 123;
            // 1、通过String.valueOf()方法将基本数据类型转换为字符串
            String string = String.valueOf(num);
            System.out.println("将int变量转换为字符串的结果；" + string);

            // 2、通过包装类的valueOf()静态方法将基本类型和字符串转换为包装类
            String str = "998";
            Integer integer = Integer.valueOf(num);
            Integer integer2 = Integer.valueOf(str);
            System.out.println("将int变量转换为包装类的结果：" + integer);
            System.out.println("将int变量转换为包装类的结果：" + integer2);

            // 3、通过包装类的有参构造方法将基本类型个字符串转换为包装类
            Integer integer3 = new Integer(num);
            Integer integer4 = new Integer(str);
            System.out.println("通过构造器将int变量转换为包装类的结果：" + integer3);
            System.out.println("通过构造器将int变量转换为包装类的结果：" + integer4);

            // 4、通过包装类的parseXxx()静态方法将字符串转换为基本数据类型
            int parseInt = Integer.parseInt(str);
            System.out.println("将字符串转换为基本类型的结果：" + parseInt);

            // 5、通过包装类的toSting()方法将包装类转换为字符串
            String string2 = integer.toString();
            System.out.println("将包装类转换为字符串的结果：" + string2);
    }

}
