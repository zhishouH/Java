public class TestPersonDemo {
    public static void main(String[] args) {
        /********* begin *********/
        // 声明并实例化一Person对象p
        Person p = new Person();
        // 给p中的属性赋值
        p.setName("张三");
        p.setAge(18);
        // 调用Person类中的talk()方法
        p.talk();
        /********* end *********/
    }
}
// 在这里定义Person类
class Person {
    /********* begin *********/
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void talk() {
        System.out.println("我是：" + name + "，今年：" + age + "岁");
    }
    /********* end *********/
}
