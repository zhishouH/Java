public class superTest {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s = new Student();
        s.school = "哈佛大学";
        System.out.println("姓名：" + s.name + "，年龄：" + s.age + "，学校：" + s.school);
    }
    /********* end *********/
}
class Person {
    /********* begin *********/
    String name;
    int age;
    // 父类的构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /********* end *********/
}
class Student extends Person {
    /********* begin *********/
    String school;
    // 子类的构造方法
    public Student() {
        // 在这里用super调用父类中的构造方法
        super("张三", 18);
    }
    /********* end *********/
}