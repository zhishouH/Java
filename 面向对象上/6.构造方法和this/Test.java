public class Test {
//    在测试类中创建两个Student对象，一个使用无参的构造方法，然后调用方法给姓名和成绩赋值，
//    另一个使用有参的构造方法，在构造方法中给姓名和成绩赋值。
    public static void main(String[] args) {

        Student one = new Student();
        one.setName("张三");
        one.setGrade(50);
        System.out.println(one.getName());
        System.out.println(one.getGrade());

        Student two = new Student("李四",60);
        System.out.println(two.getName());
        System.out.println(two.getGrade());

    }
}
