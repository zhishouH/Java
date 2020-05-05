public class Student {
//    Student类中包含姓名、成绩两个属性。
    private String name;
    private int grade;
//    分别给这两个属性定义两个方法，一个方法用于设置值，另一个方法用于获取值。

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

//    Student类中定义一个无参的构造方法和一个接收两个参数的构造方法，两个参数分别为姓名和成绩属性赋值。
    public Student() {

    }
    public Student(String name,int grade) {
        this.name=name;
        this.grade=grade;
    }
}
