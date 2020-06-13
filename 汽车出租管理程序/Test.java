import java.util.*;
public class Test {
    public static void  main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        //车辆信息
        ArrayList<Car> cars = new ArrayList<Car>();

        Car one = new Bus("客车","斯柯达","4.0L",23,"白色",800);
        cars.add(one);

        Car two = new Bus("客车","宇通T7","2.8T",21,"银色",600);
        cars.add(two);

        Car three = new Bus("客车","考斯特","2.8T",21,"白色",600);
        cars.add(three);

        Car four = new Mpv("面包车","别克GL8","2.0T",7,"珍珠黑色",450);
        cars.add(four);

        Car five = new Mpv("面包车","丰田奥德赛","2.0L",7,"白色",450);
        cars.add(five);

        Car six = new Mpv("面包车","传祺GM8","2.0T",7,"商务灰色",450);
        cars.add(six);

        Car seven = new Saloon("轿车","奥迪A3","1.4T",5,"红色",450);
        cars.add(seven);

        Car eight = new Saloon("轿车","奔驰 E 260L","1.5T",5,"黑色",450);
        cars.add(eight);

        Car nine = new Saloon("轿车","丰田皇冠","2.0T",5,"白黑色",450);
        cars.add(nine);

        //用户信息
        ArrayList<Client> clients = new ArrayList<Client>();

        System.out.println("欢迎使用我的汽车租赁平台！");
        System.out.println("请选择你需要办理的业务：1、汽车租赁 2、汽车归还");
        int input = sc.nextInt(); //选择办理的业务
        //汽车租赁
        if (input == 1) {
            System.out.println("请选择符合您需要的车型：1、客车  2、面包车  3、轿车");
            int type = sc.nextInt(); //选择车型
            if ( type == 1 ) {
                for (int i = 0 ; i < 3 ; i++) {
                    System.out.println( i+1 + ". 车型：" + cars.get(i).getModel() + "  品牌：" + cars.get(i).getBrand() + "  排量：" + cars.get(i).getDisplacement() + "  座位：" + cars.get(i).getSeat() + "座"+ "  颜色：" +cars.get(i).getColor() + "  租金：" + cars.get(i).getRent() + "元/天");
                }
                System.out.println("请选择您想要租赁的车辆：1、第一辆 2、第二辆 3、第三辆");
                int carNumber = sc.nextInt(); //选择车辆
                if (carNumber == 1) {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber-1).getModel() + " 品牌：" + cars.get(carNumber-1).getBrand() + " 排量：" + cars.get(carNumber-1).getDisplacement() + " 座位：" + cars.get(carNumber-1).getSeat() + "座 颜色：" +cars.get(carNumber-1).getColor() + " 租金：" + cars.get(carNumber-1).getRent() + "元/天");
                } else if (carNumber == 2) {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber-1).getModel() + " 品牌：" + cars.get(carNumber-1).getBrand() + " 排量：" + cars.get(carNumber-1).getDisplacement() + " 座位：" + cars.get(carNumber-1).getSeat() + "座 颜色：" +cars.get(carNumber-1).getColor() + " 租金：" + cars.get(carNumber-1).getRent() + "元/天");
                } else {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber-1).getModel() + " 品牌：" + cars.get(carNumber-1).getBrand() + " 排量：" + cars.get(carNumber-1).getDisplacement() + " 座位：" + cars.get(carNumber-1).getSeat() + "座 颜色：" +cars.get(carNumber-1).getColor() + " 租金：" + cars.get(carNumber-1).getRent() + "元/天");
                }
                System.out.println("请输入租赁时长： 天");
                int date = sc.nextInt(); //输入天数
                System.out.println("1、确定 2、取消");
                int whether = sc.nextInt();//输入确认或取消
                String str1 = sc.nextLine();
                if (whether == 1) {
                    System.out.println("请输入姓名：");
                    str1 = sc.next();

                    System.out.println("请输入电话号码：");
                    String str2 = sc.next();

                    System.out.println("请输入身份证号码：");
                    String str3 = sc.next();

                    System.out.println("请输入驾驶证号码：");
                    String str4 = sc.next();

                    System.out.println("请输入用户等级：(1、普通用户  2、铂金用户  3、钻石用户  4、至尊用户) ");
                    int str5 = sc.nextInt();
                    Client user = new Client(str1,str2,str3,str4,str5);
                    clients.add(user);
                    if (str5 == 1) {
                        System.out.println("您需要支付租金为： " +  (cars.get(carNumber-1).getRent() * date)+ "元 请预先支付租金的50%：" +((cars.get(carNumber-1).getRent() * 0.5) * date)+ "元 剩余租金于车辆归还时支付结清！" );
                    } else if (str5 == 2) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber-1).getRent() * 0.9) * date)+ "元 请预先支付租金的50%:" + (((cars.get(carNumber-1).getRent() * 0.9) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                    } else if (str5 == 3) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber-1).getRent() * 0.8) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber-1).getRent() * 0.8) *0.5 ) * date) + "元 剩余租金于车辆归还时支付结清！");
                    } else if (str5 == 4) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber-1).getRent() * 0.6) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber-1).getRent() * 0.7) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                    }
                    cars.remove(carNumber-1);
                    System.out.println("祝您用车愉快！");
                } else {
                    System.out.println("欢迎下次使用！");
                }
            } else if (type == 2) {
                for (int i = 3 ; i < 6 ; i++) {
                    System.out.println(i - 2 + ". 车型：" + cars.get(i).getModel() + "  品牌：" + cars.get(i).getBrand() + "  排量：" + cars.get(i).getDisplacement() + "  座位：" + cars.get(i).getSeat() + "座" + "  颜色：" + cars.get(i).getColor() + "  租金：" + cars.get(i).getRent() + "元/天");
                }
                System.out.println("请选择您想要租赁的车辆：1、第一辆 2、第二辆 3、第三辆");
                int carNumber = sc.nextInt(); //选择车辆
                if (carNumber == 1) {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+3).getModel() + " 品牌：" + cars.get(carNumber+3).getBrand() + " 排量：" + cars.get(carNumber+3).getDisplacement() + " 座位：" + cars.get(carNumber+3).getSeat() + "座 颜色：" +cars.get(carNumber+3).getColor() + " 租金：" + cars.get(carNumber+3).getRent() + "元/天");
                } else if (carNumber == 2) {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+3).getModel() + " 品牌：" + cars.get(carNumber+3).getBrand() + " 排量：" + cars.get(carNumber+3).getDisplacement() + " 座位：" + cars.get(carNumber+3).getSeat() + "座 颜色：" +cars.get(carNumber+3).getColor() + " 租金：" + cars.get(carNumber+3).getRent() + "元/天");
                } else {
                    System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+3).getModel() + " 品牌：" + cars.get(carNumber+3).getBrand() + " 排量：" + cars.get(carNumber+3).getDisplacement() + " 座位：" + cars.get(carNumber+3).getSeat() + "座 颜色：" +cars.get(carNumber+3).getColor() + " 租金：" + cars.get(carNumber+3).getRent() + "元/天");
                }
                System.out.println("请输入租赁时长： 天");
                int date = sc.nextInt(); //输入天数
                System.out.println("1、确定 2、取消");
                int whether = sc.nextInt();//输入确认或取消
                String str1 = sc.nextLine();
                if (whether == 1) {
                    System.out.println("请输入姓名：");
                    str1 = sc.next();

                    System.out.println("请输入电话号码：");
                    String str2 = sc.next();

                    System.out.println("请输入身份证号码：");
                    String str3 = sc.next();

                    System.out.println("请输入驾驶证号码：");
                    String str4 = sc.next();

                    System.out.println("请输入用户等级：(1、普通用户  2、铂金用户  3、钻石用户  4、至尊用户) ");
                    int str5 = sc.nextInt();
                    Client user = new Client(str1,str2,str3,str4,str5);
                    clients.add(user);
                    if (str5 == 1) {
                        System.out.println("您需要支付租金为： " +  (cars.get(carNumber+3).getRent() * date)+ "元 请预先支付租金的50%：" +((cars.get(carNumber+3).getRent() * 0.5) * date)+ "元 剩余租金于车辆归还时支付结清！" );
                    } else if (str5 == 2) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber+3).getRent() * 0.9) * date)+ "元 请预先支付租金的50%:" + (((cars.get(carNumber+3).getRent() * 0.9) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                    } else if (str5 == 3) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber+3).getRent() * 0.8) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber+3).getRent() * 0.8) *0.5 ) * date) + "元 剩余租金于车辆归还时支付结清！");
                    } else if (str5 == 4) {
                        System.out.println("您需要支付租金为：" + ((cars.get(carNumber+3).getRent() * 0.7) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber+3).getRent() * 0.7) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                    }
                    cars.remove(carNumber+3);
                    System.out.println("祝您用车愉快！");
                } else {
                    System.out.println("欢迎下次使用！");
                }
           } else{
                if( type == 3) {
                    for (int i = 6 ; i < 9 ; i++) {
                        System.out.println( i-5 + ". 车型：" + cars.get(i).getModel() + "  品牌：" + cars.get(i).getBrand() + "  排量：" + cars.get(i).getDisplacement() + "  座位：" + cars.get(i).getSeat() + "座"+ "  颜色：" +cars.get(i).getColor() + "  租金：" + cars.get(i).getRent() + "元/天");
                    }
                    System.out.println("请选择您想要租赁的车辆：1、第一辆 2、第二辆 3、第三辆");
                    int carNumber = sc.nextInt(); //选择车辆
                    if (carNumber == 1) {
                        System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+5).getModel() + " 品牌：" + cars.get(carNumber+5).getBrand() + " 排量：" + cars.get(carNumber+5).getDisplacement() + " 座位：" + cars.get(carNumber+5).getSeat() + "座 颜色：" +cars.get(carNumber+5).getColor() + " 租金：" + cars.get(carNumber+5).getRent() + "元/天");
                    } else if (carNumber == 2) {
                        System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+5).getModel() + " 品牌：" + cars.get(carNumber+5).getBrand() + " 排量：" + cars.get(carNumber+5).getDisplacement() + " 座位：" + cars.get(carNumber+5).getSeat() + "座 颜色：" +cars.get(carNumber+5).getColor() + " 租金：" + cars.get(carNumber+5).getRent() + "元/天");
                    } else {
                        System.out.println("请确定租赁车辆的信息：车型：" + cars.get(carNumber+5).getModel() + " 品牌：" + cars.get(carNumber+5).getBrand() + " 排量：" + cars.get(carNumber+5).getDisplacement() + " 座位：" + cars.get(carNumber+5).getSeat() + "座 颜色：" +cars.get(carNumber+5).getColor() + " 租金：" + cars.get(carNumber+5).getRent() + "元/天");
                    }
                    System.out.println("请输入租赁时长： 天");
                    int date = sc.nextInt(); //输入天数
                    System.out.println("1、确定 2、取消");
                    int whether = sc.nextInt(); //输入确认或取消
                    String str1 = sc.nextLine();
                    if (whether == 1) {
                        System.out.println("请输入姓名：");
                        str1 = sc.next();

                        System.out.println("请输入电话号码：");
                        String str2 = sc.next();

                        System.out.println("请输入身份证号码：");
                        String str3 = sc.next();

                        System.out.println("请输入驾驶证号码：");
                        String str4 = sc.next();

                        System.out.println("请输入用户等级：(1、普通用户  2、铂金用户  3、钻石用户  4、至尊用户) ");
                        int str5 = sc.nextInt();
                        Client user = new Client(str1,str2,str3,str4,str5);
                        clients.add(user);
                        if (str5 == 1) {
                            System.out.println("您需要支付租金为： " +  (cars.get(carNumber+5).getRent() * date)+ "元 请预先支付租金的50%：" +((cars.get(carNumber+5).getRent() * 0.5) * date)+ "元 剩余租金于车辆归还时支付结清！" );
                        } else if (str5 == 2) {
                            System.out.println("您需要支付租金为：" + ((cars.get(carNumber+5).getRent() * 0.9) * date)+ "元 请预先支付租金的50%:" + (((cars.get(carNumber+5).getRent() * 0.9) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                        } else if (str5 == 3) {
                            System.out.println("您需要支付租金为：" + ((cars.get(carNumber+5).getRent() * 0.8) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber+5).getRent() * 0.8) *0.5 ) * date) + "元 剩余租金于车辆归还时支付结清！");
                        } else if (str5 == 4) {
                            System.out.println("您需要支付租金为：" + ((cars.get(carNumber+5).getRent() * 0.7) * date)+ "元 请预先支付租金的50%：" + (((cars.get(carNumber+5).getRent() * 0.7) * 0.5) * date) + "元 剩余租金于车辆归还时支付结清！");
                        }
                        cars.remove(carNumber+5);
                        System.out.println("祝您用车愉快！");
                    } else {
                        System.out.println("欢迎下次使用！");
                    }
                } else {
                        System.out.println("没有更多！");
                }
            }
         //汽车归还
        } else {
            if(input == 2) {
                System.out.println("请选择归还的车型：1、客车 2、面包车 3、轿车");
                int modelNumber = sc.nextInt();

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

                System.out.println("请输入租金");
                int inputRent = sc.nextInt();

                if ( modelNumber== 1) {
                    Car give = new Bus(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputRent);
                    cars.add(give);
                }   else if(modelNumber == 2) {
                    Car give = new Mpv(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputRent);
                    cars.add(give);
                }   else {
                    Car give = new Saloon(inputModel,inputBrand,inputDisplacement,inputSeat,inputColor,inputRent);
                    cars.add(give);
                }
                System.out.println("归还车辆信息为：车型：" + cars.get(cars.size()-1).getModel() + " 品牌：" + cars.get(cars.size()-1).getBrand() + " 排量：" + cars.get(cars.size()-1).getDisplacement() + " 座位：" + cars.get(cars.size()-1).getSeat() + "座 颜色：" + cars.get(cars.size()-1).getColor() + " 租金：" + cars.get(cars.size()-1).getRent() + "元/天");
                System.out.println("请输入您租赁的时长： 天");
                int inputDate = sc.nextInt();
                System.out.println("请输入您的名字：");
                String inputName = sc.next();
                System.out.println("请输入您的用户等级：1、普通用户 2、铂金用户  3、钻石用户  4、至尊用户");
                int inputGrade = sc.nextInt();
                if (inputGrade == 1) {
                    System.out.println("您需要支付剩余租金为： " + ((cars.get(cars.size()-1).getRent() * 0.5) * inputDate)+ "元" );
                } else if (inputGrade == 2) {
                    System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.9)* 0.5) * inputDate)+ "元");
                } else if (inputGrade == 3) {
                    System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.8)* 0.5) * inputDate)+ "元");
                } else if (inputGrade == 4) {
                    System.out.println("您需要支付剩余租金为：" + (((cars.get(cars.size()-1).getRent() * 0.7 )* 0.5) * inputDate)+ "元");
                }
                System.out.println("谢谢使用！");
            }else {
                System.out.println("欢迎下次使用！");
            }

        }
    }


}
