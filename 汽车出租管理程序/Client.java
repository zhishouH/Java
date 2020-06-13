public class Client {
    private String name; //姓名
    private String number;  //电话号码
    private String idCard;  //身份证号码
    private String  driveLicense; //驾驶证号码
    private int grade; //用户等级

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public Client(String name,String number,String idCard,String driveLicense,int grade) {
        this.name = name;
        this.number= number;
        this.idCard = idCard;
        this.driveLicense = driveLicense;
        this.grade = grade;
    }
    public Client() {

    }

}
