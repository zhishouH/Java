public class Moon {
//    定义一个Moon类，通过代码设计，要求该类只能创建一个实例。（单例模式）
    private Moon() {

    }
    private static Moon instance = new Moon();

    public static Moon getInstance() {
        return instance;
    }
}
