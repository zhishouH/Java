
//   为梯形类Trapezia的成员增加访问控制符，实现封装性。

public class Trapezia {
    private double upperLength;
    private double downLength;
    private int height;

    public double area() {
        return ((upperLength + downLength) * height/ 2);
    }

    public double getUpperLength() {
        return upperLength;
    }

    public void setUpperLength(double upperLength) {
        this.upperLength = upperLength;
    }

    public double getDownLength() {
        return downLength;
    }

    public void setDownLength(double downLength) {
        this.downLength = downLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
