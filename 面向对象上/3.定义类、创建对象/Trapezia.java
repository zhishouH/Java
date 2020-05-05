
//    创建Trapezia类表示梯形，要求如下：
//    定义几个成员变量表示梯形的特征；
//    定义方法计算梯形面积；

public class Trapezia {
    double upperLength;
    double downLength;
    double height;

    public double area() {
        return ((upperLength + downLength) * height/ 2);
    }
}
