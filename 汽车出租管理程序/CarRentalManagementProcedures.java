import java.util.*;
public class CarRentalManagementProcedures {
    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);

        //车辆信息管理  采用ArrayList
        ArrayList<Car> cars = new ArrayList<Car>();
        //车库剩余车辆9辆
        Car one = new Bus("客车","斯柯达","4.0L",23,"白色","粤A·11111",800);
        cars.add(one);
        Car two = new Bus("客车","宇通T7","2.8T",21,"银色","粤A·22222",600);
        cars.add(two);
        Car three = new Bus("客车","考斯特","2.8T",21,"白色","粤A·33333",600);
        cars.add(three);
        Car four = new Mpv("面包车","别克GL8","2.0T",7,"黑色","粤A·44444",450);
        cars.add(four);
        Car five = new Mpv("面包车","丰田奥德赛","2.0L",7,"白色","粤A·55555",450);
        cars.add(five);
        Car six = new Mpv("面包车","传祺GM8","2.0T",7,"灰色","粤A·66666",450);
        cars.add(six);
        Car seven = new Saloon("轿车","奥迪A3","1.4T",5,"红色","粤A·77777",450);
        cars.add(seven);
        Car eight = new Saloon("轿车","奔驰 E 260L","1.5T",5,"黑色","粤A·88888",450);
        cars.add(eight);
        Car nine = new Saloon("轿车","丰田皇冠","2.0T",5,"黑色","粤A·99999",450);
        cars.add(nine);

        //用户信息管理
        //老客户   用户等级1、普通用户 2、铂金用户 3、钻石用户 4、至尊用户
        ArrayList<Client> clients = new ArrayList<Client>();
        Client user1 = new Client("张三","13751932093","441502020000101222X","441502020000101",1);
        clients.add(user1);
        Client user2 = new Client("李四","13751933093","441502020000202333X","441502020000202",2);
        clients.add(user2);
        Client user3 = new Client("王五","13751934093","441502020000303444X","441502020000303",3);
        clients.add(user3);
        Client user4 = new Client("程小明","13751935093","441502020000404555X","441502020000404",4);
        clients.add(user4);

        System.out.println("欢迎访问我的汽车租赁平台！");
        System.out.println("请选择您办理额业务：1、汽车租赁 2、汽车归还");
        int inputBusiness = sc.nextInt(); //用户输入业务
        if (inputBusiness == 1) {
            System.out.println("车库剩余车辆为：" + cars.size() + "辆， 车辆类型有 1.客车 2.面包车 3.轿车");
            System.out.println("请选择您需要的车辆类型");
            int inputModel = sc.nextInt();//用户选择车辆类型
            if (inputModel == 1) {  //选择1.客车，开始
                for (int i = 0 ; i < 3 ; i++) {
                    System.out.println( i+1 + ". 车型：" + cars.get(i).getModel() + "  品牌：" + cars.get(i).getBrand() + "  排量：" + cars.get(i).getDisplacement() + "  座位：" + cars.get(i).getSeat() + "座"+ "  颜色：" +cars.get(i).getColor() + "车牌号码：" + cars.get(i).getCarNumber() +" 租金：" + cars.get(i).getRent() + "元/天");
                }
                System.out.println("请选择您需要租赁的车辆：1.第一辆 2.第二辆 3.第三辆");
                int inputCar = sc.nextInt(); //用户选择车辆序号
                if(inputCar == 1) {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar-1).getModel() + " 品牌：" + cars.get(inputCar-1).getBrand() + " 排量：" + cars.get(inputCar-1).getDisplacement() + " 座位：" + cars.get(inputCar-1).getSeat() + "座 颜色：" +cars.get(inputCar-1).getColor() +  " 车牌号码：" + cars.get(inputCar-1).getCarNumber()+ " 租金：" + cars.get(inputCar-1).getRent() + "元/天");
                } else if (inputCar == 2) {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar-1).getModel() + " 品牌：" + cars.get(inputCar-1).getBrand() + " 排量：" + cars.get(inputCar-1).getDisplacement() + " 座位：" + cars.get(inputCar-1).getSeat() + "座 颜色：" +cars.get(inputCar-1).getColor() +  " 车牌号码：" + cars.get(inputCar-1).getCarNumber()+ " 租金：" + cars.get(inputCar-1).getRent() + "元/天");
                } else {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar-1).getModel() + " 品牌：" + cars.get(inputCar-1).getBrand() + " 排量：" + cars.get(inputCar-1).getDisplacement() + " 座位：" + cars.get(inputCar-1).getSeat() + "座 颜色：" +cars.get(inputCar-1).getColor() +  " 车牌号码：" + cars.get(inputCar-1).getCarNumber()+ " 租金：" + cars.get(inputCar-1).getRent() + "元/天");
                }
                System.out.println("请输入租赁时长： 天");
                int inputDate = sc.nextInt(); //用户输入租赁时长
                System.out.println("请选择你的用户身份：1.新客户 2.老客户");
                int inputIdentity = sc.nextInt();//用户输入身份
                if (inputIdentity == 1) { //新客户
                    System.out.println("请输入姓名：");
                    String inputName = sc.next(); //用户输入姓名
                    System.out.println("请输入电话号码：");
                    String inputNumber = sc.next(); //用户输入电话号码
                    System.out.println("请输入身份证号码：");
                    String inputIdCard = sc.next(); //用户输入身份证号码
                    System.out.println("请输入驾驶证号码：");
                    String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                    System.out.println("当前用户等级为1.普通用户");
                    System.out.println("支付￥99立即升级为铂金用户可享受九折优惠");
                    System.out.println("支付￥199立即升级为钻石用户可享受八折优惠");
                    System.out.println("支付￥299立即升级为至尊用户可享受七折优惠");
                    System.out.println("是否升级为其他等级:1.是 2.否");
                    int inputWhether = sc.nextInt();
                    if (inputWhether == 1) { //确认升级用户等级
                        System.out.println("请选择用户等级：1.铂金用户 2.钻石用户 3.至尊用户");
                        int inputGrade = sc.nextInt();
                        if (inputGrade == 1) {
                            System.out.println("您已升级为铂金用户，请先支付￥99");
                        } else if (inputGrade == 2) {
                            System.out.println("您已升级为钻石用户，请先支付￥199");
                        } else {
                            if (inputGrade == 3) {
                                System.out.println("您已升级为至尊用户，请先支付￥299");
                            }
                        }
                            Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade+1);
                            clients.add(newUser);
                    } else { //不升级用户等级，此时用户等级为1
                        if (inputWhether == 2) {
                            Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,1);
                            clients.add(newUser);
                        }
                    }
                    System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码:" +clients.get(clients.size()-1).getNumber()+ " 身份证号码:" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码:" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                    System.out.println("请确认以上信息. 1.确认 2.取消");
                    inputWhether = sc.nextInt();
                    if (inputWhether == 1) {
                        int userGrade = clients.get(clients.size()-1).getGrade();
                        if (userGrade == 1) { //支付一半，剩余归还车辆时结清
                            System.out.println("您需要支付的租金为：" + (cars.get(inputCar-1).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar-1).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else if(userGrade == 2){
                            System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else if (userGrade == 3) {
                            System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else {
                            if (userGrade == 4) {
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            }
                        }
                        System.out.println("祝你用车愉快！");
                        cars.remove(inputCar-1);
                    } else {
                        System.out.println("欢迎下次使用！");
                    }
                } else { //老客户
                    if (inputIdentity == 2) {
                        System.out.println("请输入姓名：");
                        String inputName = sc.next(); //用户输入姓名
                        System.out.println("请输入电话号码：");
                        String inputNumber = sc.next(); //用户输入电话号码
                        System.out.println("请输入身份证号码：");
                        String inputIdCard = sc.next(); //用户输入身份证号码
                        System.out.println("请输入驾驶证号码：");
                        String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                        System.out.println("请输入用户等级：1.普通用户 2.铂金用户 3.钻石用户 4.至尊用户");
                        int inputGrade = sc.nextInt();
                        Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade);
                        clients.add(newUser);
                        System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码：" +clients.get(clients.size()-1).getNumber()+ " 身份证号码：" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码：" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                        System.out.println("请确认以上信息. 1.确认 2.取消");
                        int inputWhether = sc.nextInt();
                        if (inputWhether == 1) {
                            if ( inputGrade == 1) { //支付一半，剩余归还车辆时结清
                                System.out.println("您需要支付的租金为：" + (cars.get(inputCar-1).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar-1).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if(inputGrade== 2){
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if (inputGrade == 3) {
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else {
                                if (inputGrade == 4) {
                                    System.out.println("您需要支付的租金为：" + ((cars.get(inputCar-1).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar-1).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                }
                            }
                            System.out.println("祝你用车愉快！");
                            cars.remove(inputCar-1);
                        } else {
                            System.out.println("欢迎您下次使用！");
                        }
                    }
                }
                System.out.println("当前车库剩余车辆为：" +cars.size());
                //选择1.客车，结束
            } else if(inputModel == 2) { //选择2.面包车，开始
                for (int i = 0 ; i < 3 ; i++) {
                    System.out.println( i+1 + ". 车型：" + cars.get(i+3).getModel() + "  品牌：" + cars.get(i+3).getBrand() + "  排量：" + cars.get(i+3).getDisplacement() + "  座位：" + cars.get(i+3).getSeat() + "座"+ "  颜色：" +cars.get(i+3).getColor() + "  租金：" + cars.get(i+3).getRent() + "元/天 车牌号码：" + cars.get(i+3).getCarNumber());
                }
                System.out.println("请选择您需要租赁的车辆：1.第一辆 2.第二辆 3.第三辆");
                int inputCar = sc.nextInt(); //用户选择车辆序号
                if(inputCar == 1) {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+3).getModel() + " 品牌：" + cars.get(inputCar+3).getBrand() + " 排量：" + cars.get(inputCar+3).getDisplacement() + " 座位：" + cars.get(inputCar+3).getSeat() + "座 颜色：" +cars.get(inputCar+3).getColor() +  " 车牌号码：" + cars.get(inputCar+3).getCarNumber()+ " 租金：" + cars.get(inputCar+3).getRent() + "元/天");
                } else if (inputCar == 2) {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+3).getModel() + " 品牌：" + cars.get(inputCar+3).getBrand() + " 排量：" + cars.get(inputCar+3).getDisplacement() + " 座位：" + cars.get(inputCar+3).getSeat() + "座 颜色：" +cars.get(inputCar+3).getColor() +  " 车牌号码：" + cars.get(inputCar+3).getCarNumber()+ " 租金：" + cars.get(inputCar+3).getRent() + "元/天");
                } else {
                    System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+3).getModel() + " 品牌：" + cars.get(inputCar+3).getBrand() + " 排量：" + cars.get(inputCar+3).getDisplacement() + " 座位：" + cars.get(inputCar+3).getSeat() + "座 颜色：" +cars.get(inputCar+3).getColor() +  " 车牌号码：" + cars.get(inputCar+3).getCarNumber()+ " 租金：" + cars.get(inputCar+3).getRent() + "元/天");
                }
                System.out.println("请输入租赁时长： 天");
                int inputDate = sc.nextInt(); //用户输入租赁时长
                System.out.println("请选择你的用户身份：1.新客户 2.老客户");
                int inputIdentity = sc.nextInt();//用户输入身份
                if (inputIdentity == 1) { //新客户
                    System.out.println("请输入姓名：");
                    String inputName = sc.next(); //用户输入姓名
                    System.out.println("请输入电话号码：");
                    String inputNumber = sc.next(); //用户输入电话号码
                    System.out.println("请输入身份证号码：");
                    String inputIdCard = sc.next(); //用户输入身份证号码
                    System.out.println("请输入驾驶证号码：");
                    String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                    System.out.println("当前用户等级为1.普通用户");
                    System.out.println("支付￥99立即升级为铂金用户可享受九折优惠");
                    System.out.println("支付￥199立即升级为钻石用户可享受八折优惠");
                    System.out.println("支付￥299立即升级为至尊用户可享受七折优惠");
                    System.out.println("是否升级为其他等级:1.是 2.否");
                    int inputWhether = sc.nextInt();
                    if (inputWhether == 1) { //确认升级
                        System.out.println("请选择用户等级：1.铂金用户 2.钻石用户 3.至尊用户");
                        int inputGrade = sc.nextInt();
                        if (inputGrade == 1) {
                            System.out.println("您已升级为铂金用户,请先支付￥99");
                        } else if (inputGrade == 2) {
                            System.out.println("您已升级为钻石用户,请先支付￥199");
                        } else {
                            if (inputGrade == 3) {
                                System.out.println("您已升级为至尊用户,请先支付￥299");
                            }
                        }
                        Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade+1);
                        clients.add(newUser);
                    } else { //取消升级
                        if (inputWhether == 2) {
                            Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,1);
                            clients.add(newUser);
                        }
                    }
                    System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码:" +clients.get(clients.size()-1).getNumber()+ " 身份证号码:" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码:" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                    System.out.println("请确认以上信息. 1.确认 2.取消");
                    inputWhether = sc.nextInt();
                    if (inputWhether == 1) {
                        int userGrade = clients.get(clients.size()-1).getGrade();
                        if (userGrade == 1) { //支付一半，剩余归还车辆时结清
                            System.out.println("您需要支付的租金为：" + (cars.get(inputCar+3).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar+3).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else if(userGrade == 2){
                            System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else if (userGrade == 3) {
                            System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                        } else {
                            if (userGrade == 4) {
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            }
                        }
                        System.out.println("祝你用车愉快！");
                        cars.remove(inputCar+2);
                    } else {
                        System.out.println("欢迎下次使用！");
                    }
                } else { //老客户
                    if (inputIdentity == 2) {
                        System.out.println("请输入姓名：");
                        String inputName = sc.next(); //用户输入姓名
                        System.out.println("请输入电话号码：");
                        String inputNumber = sc.next(); //用户输入电话号码
                        System.out.println("请输入身份证号码：");
                        String inputIdCard = sc.next(); //用户输入身份证号码
                        System.out.println("请输入驾驶证号码：");
                        String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                        System.out.println("请输入用户等级：1.普通用户 2.铂金用户 3.钻石用户 4.至尊用户");
                        int inputGrade = sc.nextInt();
                        Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade);
                        clients.add(newUser);
                        System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码:" +clients.get(clients.size()-1).getNumber()+ " 身份证号码:" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码:" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                        System.out.println("请确认以上信息. 1.确认 2.取消");
                        int inputWhether = sc.nextInt();
                        if (inputWhether == 1) {
                            if ( inputGrade == 1) { //支付一半，剩余归还车辆时结清
                                System.out.println("您需要支付的租金为：" + (cars.get(inputCar+3).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar+3).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if(inputGrade== 2){
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if (inputGrade == 3) {
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else {
                                if (inputGrade == 4) {
                                    System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+3).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+3).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                }
                            }
                            System.out.println("祝你用车愉快！");
                            cars.remove(inputCar+2);
                        } else {
                            System.out.println("欢迎下次使用！");
                        }
                    }
                }
                System.out.println("当前车库剩余车辆为：" +cars.size());
            //选择2.面包车，结束
            } else {
                if (inputModel == 3) {
                    for(int i = 0 ; i < 3 ; i++) {
                        System.out.println( i+1 + ". 车型：" + cars.get(i+6).getModel() + "  品牌：" + cars.get(i+6).getBrand() + "  排量：" + cars.get(i+6).getDisplacement() + "  座位：" + cars.get(i+6).getSeat() + "座"+ "  颜色：" +cars.get(i+6).getColor() + "  租金：" + cars.get(i+6).getRent() + "元/天");
                    }
                    System.out.println("请选择您需要租赁的车辆：1.第一辆 2.第二辆 3.第三辆");
                    int inputCar = sc.nextInt(); //用户选择车辆序号
                    if(inputCar == 1) {
                        System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+5).getModel() + " 品牌：" + cars.get(inputCar+5).getBrand() + " 排量：" + cars.get(inputCar+5).getDisplacement() + " 座位：" + cars.get(inputCar+5).getSeat() + "座 颜色：" +cars.get(inputCar+5).getColor() +  " 车牌号码：" + cars.get(inputCar+5).getCarNumber()+ " 租金：" + cars.get(inputCar+5).getRent() + "元/天");
                    } else if (inputCar == 2) {
                        System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+5).getModel() + " 品牌：" + cars.get(inputCar+5).getBrand() + " 排量：" + cars.get(inputCar+5).getDisplacement() + " 座位：" + cars.get(inputCar+5).getSeat() + "座 颜色：" +cars.get(inputCar+5).getColor() +  " 车牌号码：" + cars.get(inputCar+5).getCarNumber()+ " 租金：" + cars.get(inputCar+5).getRent() + "元/天");
                    } else {
                        System.out.println("车辆信息：车辆号："+ inputCar +" 车型:" +  cars.get(inputCar+5).getModel() + " 品牌：" + cars.get(inputCar+5).getBrand() + " 排量：" + cars.get(inputCar+5).getDisplacement() + " 座位：" + cars.get(inputCar+5).getSeat() + "座 颜色：" +cars.get(inputCar+5).getColor() +  " 车牌号码：" + cars.get(inputCar+5).getCarNumber()+ " 租金：" + cars.get(inputCar+5).getRent() + "元/天");
                    }
                    System.out.println("请输入租赁时长： 天");
                    int inputDate = sc.nextInt(); //用户输入租赁时长
                    System.out.println("请选择你的用户身份：1.新客户 2.老客户");
                    int inputIdentity = sc.nextInt();//用户输入身份
                    if (inputIdentity == 1) { //新客户
                        System.out.println("请输入姓名：");
                        String inputName = sc.next(); //用户输入姓名
                        System.out.println("请输入电话号码：");
                        String inputNumber = sc.next(); //用户输入电话号码
                        System.out.println("请输入身份证号码：");
                        String inputIdCard = sc.next(); //用户输入身份证号码
                        System.out.println("请输入驾驶证号码：");
                        String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                        System.out.println("当前用户等级为1.普通用户");
                        System.out.println("支付￥99立即升级为铂金用户可享受九折优惠");
                        System.out.println("支付￥199立即升级为钻石用户可享受八折优惠");
                        System.out.println("支付￥299立即升级为至尊用户可享受七折优惠");
                        System.out.println("是否升级为其他等级:1.是 2.否");
                        int inputWhether = sc.nextInt();
                        if (inputWhether == 1) {
                            System.out.println("请选择用户等级：1.铂金用户 2.钻石用户 3.至尊用户");
                            int inputGrade = sc.nextInt();
                            if (inputGrade == 1) {
                                System.out.println("您已升级为铂金用户,请先支付￥99");
                            } else if (inputGrade == 2) {
                                System.out.println("您已升级为钻石用户,请先支付￥99");
                            } else {
                                if (inputGrade == 3) {
                                    System.out.println("您已升级为至尊用户,请先支付￥99");
                                }
                            }
                            Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade+1);
                            clients.add(newUser);

                        } else {
                            if (inputWhether == 2) {
                                Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,1);
                                clients.add(newUser);
                            }
                        }
                        System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码：" +clients.get(clients.size()-1).getNumber()+ " 身份证号码：" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码：" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                        System.out.println("请确认以上信息. 1.确认 2.取消");
                        inputWhether = sc.nextInt();
                        if (inputWhether == 1) {
                            int userGrade = clients.get(clients.size()-1).getGrade();
                            if (userGrade == 1) { //支付一半，剩余归还车辆时结清
                                System.out.println("您需要支付的租金为：" + (cars.get(inputCar+5).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar+5).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if(userGrade == 2){
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else if (userGrade == 3) {
                                System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                            } else {
                                if (userGrade == 4) {
                                    System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                }
                            }
                            System.out.println("祝你用车愉快！");
                            cars.remove(inputCar+5);
                        } else {
                            System.out.println("欢迎下次使用！");
                        }
                    } else { //老客户
                        if (inputIdentity == 2) {
                            System.out.println("请输入姓名：");
                            String inputName = sc.next(); //用户输入姓名
                            System.out.println("请输入电话号码：");
                            String inputNumber = sc.next(); //用户输入电话号码
                            System.out.println("请输入身份证号码：");
                            String inputIdCard = sc.next(); //用户输入身份证号码
                            System.out.println("请输入驾驶证号码：");
                            String inputDriveLicense = sc.next(); //用户输入驾驶证号码
                            System.out.println("请输入用户等级：1.普通用户 2.铂金用户 3.钻石用户 4.至尊用户");
                            int inputGrade = sc.nextInt();
                            Client newUser = new Client(inputName,inputNumber,inputIdCard,inputDriveLicense,inputGrade);
                            clients.add(newUser);
                            System.out.println("用户信息：姓名："+clients.get(clients.size()-1).getName() + " 电话号码：" +clients.get(clients.size()-1).getNumber()+ " 身份证号码：" +clients.get(clients.size()-1).getIdCard()+ " 驾驶证号码：" +clients.get(clients.size()-1).getDriveLicense()+ " 用户等级：" +clients.get(clients.size()-1).getGrade());
                            System.out.println("请确认以上信息. 1.确认 2.取消");
                            int inputWhether = sc.nextInt();
                            if (inputWhether == 1) {
                                if ( inputGrade == 1) { //支付一半，剩余归还车辆时结清
                                    System.out.println("您需要支付的租金为：" + (cars.get(inputCar+5).getRent() * inputDate) + "元 请预先支付租金的50%：" + ((cars.get(inputCar+5).getRent() * inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                } else if(inputGrade== 2){
                                    System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.9) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.9)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                } else if (inputGrade == 3) {
                                    System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.8) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.8)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                } else {
                                    if (inputGrade == 4) {
                                        System.out.println("您需要支付的租金为：" + ((cars.get(inputCar+5).getRent() * 0.7) * inputDate) + "元 请预先支付租金的50%：" + (((cars.get(inputCar+5).getRent() * 0.7)* inputDate) * 0.5) + "元 剩余部分租金将于车辆归还时结清");
                                    }
                                }
                                cars.remove(inputCar+5);
                                System.out.println("祝你用车愉快！");
                            } else {
                                System.out.println("欢迎下次使用！");
                            }
                        }
                    }
                    System.out.println("当前车库剩余车辆为：" +cars.size());
                } else {
                    System.out.println("对不起！没有更多车型");
                    System.out.println("欢迎下次使用！");
                }
            }
        //汽车出租功能结束
        } else {
            if (inputBusiness == 2) {
                System.out.println("请选择归还的车型：1、客车 2、面包车 3、轿车");
                int modelNumber = sc.nextInt();

                if (modelNumber < 4) {
                    System.out.println("请再次输入车型");
                    String inputModel = sc.next();

                    System.out.println("请输入品牌");
                    String inputBrand = sc.next();

                    System.out.println("请输入排量");
                    String inputDisplacement = sc.next();

                    System.out.println("请输入座位");
                    int inputSeat = sc.nextInt();

                    System.out.println("请输入颜色");
                    String inputColor = sc.next();

                    System.out.println("请输入车牌号码：");
                    String inputCarNumber = sc.next();

                    System.out.println("请输入租金");
                    int inputRent = sc.nextInt();

                    if (modelNumber == 1) {
                        Car give = new Bus(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputCarNumber,inputRent);
                        cars.add(give);
                    } else if (modelNumber == 2) {
                        Car give = new Mpv(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputCarNumber,inputRent);
                        cars.add(give);
                    } else  {
                        if (modelNumber == 3) {
                            Car give = new Saloon(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputCarNumber,inputRent);
                            cars.add(give);
                        }
                    }
                    System.out.println("归还车辆信息为：车型：" + cars.get(cars.size()-1).getModel() + " 品牌：" + cars.get(cars.size()-1).getBrand() + " 排量：" + cars.get(cars.size()-1).getDisplacement() + " 座位：" + cars.get(cars.size()-1).getSeat() + "座 颜色：" + cars.get(cars.size()-1).getColor() + " 车牌号码："+ cars.get(cars.size()-1).getCarNumber() + " 租金：" + cars.get(cars.size()-1).getRent() + "元/天");
                    System.out.println("请输入您租赁的时长： 天");
                    int inputDate = sc.nextInt();
                    System.out.println("请输入您的名字：");
                    String inputName = sc.next();
                    System.out.println("请输入您的用户等级：1、普通用户 2、铂金用户  3、钻石用户  4、至尊用户");
                    int inputGrade = sc.nextInt();
                    if (inputGrade == 1) {
                        System.out.println("您需要支付剩余租金为： " + ((cars.get(cars.size()-1).getRent() * 0.5) * inputDate)+ "元 " );
                    } else if (inputGrade == 2) {
                        System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.9)* 0.5) * inputDate)+ "元");
                    } else if (inputGrade == 3) {
                        System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.8)* 0.5) * inputDate)+ "元");
                    } else if (inputGrade == 4) {
                        System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.7 )* 0.5) * inputDate)+ "元");
                    } else {
                        System.out.println("无该业务，欢迎下次使用！");
                    }
                    System.out.println("欢迎您下次使用！");
                    System.out.println("车库剩余车辆为：" + cars.size() + "辆");
                }
            }else {
                System.out.println("对不起！没有该选项");
                System.out.println("欢迎您下次使用！");
            }

            //汽车归还功能结束
        }
    }
}
