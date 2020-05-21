public abstract class Shape implements Calculable {

    String Name;

    @Override
    public double calArea() {
        return 0.0;
    }
    public Shape(String name) {
        this.Name=name;
    }
}
