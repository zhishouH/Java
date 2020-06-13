public abstract class  Car {

    private String model; //车型
    private String brand; //品牌
    private String displacement; //排量
    private int seat; //座位
    private String color;//颜色
    private int rent;//租金

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public Car(String model, String brand, String displacement, int seat, String color, int rent) {
        this.model = model;
        this.brand = brand;
        this.displacement = displacement;
        this.seat = seat;
        this.color = color;
        this.rent = rent;
    }

}
