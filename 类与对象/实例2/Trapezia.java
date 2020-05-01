package C3_Work_3;

public class Trapezia {
    double upperLength;
    double downLength;
    double height;

    public double area() {
        return ((upperLength + downLength) * height/ 2);
    }
}
