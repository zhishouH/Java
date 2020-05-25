public class Test {
    public static void  main(String[] args) {
        Graduate one = new Graduate("张三","男",29,20000,18000);
        System.out.println("姓名：" + one.name +", 性别："+ one.sex + ", 年龄："+one.age +"岁, 学费：" + one.getFee() +"元, 工资："+ one.getPay()+"元.");
        if(one.getPay()-one.getFee()<2000) {
            System.out.println("provide a loan!");
        }

    }
}
