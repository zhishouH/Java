public interface Calculable {

     public abstract double calArea();

}
// 设计一个Calculable接口和它的实现类Shape以及Shape的子类Square和Circle。要求如下：
//         （1）       Calculable接口中有一个抽象方法calArea()，方法无参数，返回一个double类型的结果。
//
//         （2）       Shape类作为抽象类定义，有一个name成员变量
//
//         （3）       Square和Circle重写父类中的方法calArea()，根据需要为Square类和Circle类定义成员变量、构造方法。
//
//         （4）       编写应用程序，创建Square和Circle对象，计算边长为2的正方形的面积和半径为3的圆形面积。
//
