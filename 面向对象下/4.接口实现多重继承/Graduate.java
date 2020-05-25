public class Graduate implements StudentManageInterface,TeacherManageInterface {
    String name,sex;
    int age;
    private double fee,pay;

    public Graduate(String name,String sex,int age,double fee,double pay){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.fee=fee;
        this.pay=pay;
    }

    @Override
    public double setFee(double fee) {
        this.fee=fee;
        return 0;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public double setPay(double pay) {
        this.pay=pay;
        return 0;
    }

    @Override
    public double getPay() {
        return pay;
    }
}
