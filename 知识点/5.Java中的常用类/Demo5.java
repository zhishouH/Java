import java.util.*;
import java.time.*;
public class Demo5 {
    public static void main(String[] args) {
//        5.5.1 Date类
//        // 创建表示当前时间的Date对象
//        Date date1 = new Date();
//        // 获取当前时间后1秒的时间
//        Date date2 = new Date(System.currentTimeMillis() + 1000);
//        System.out.println(date1);
//        System.out.println(date2);

//        5.5.2 Calendar类
        // get()方法
        // 表示获取当前时间的Calendar对象
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH) + 1;
//        int date = calendar.get(Calendar.DATE);
//        int hour = calendar.get(Calendar.HOUR);
//        int minute = calendar.get(Calendar.MINUTE);
//        int second = calendar.get(Calendar.SECOND);
//        System.out.println("当前时间为：" + year + "年" + month + "月" + date + "日" + hour + "时" + minute + "分" + second + "秒");

        // add()，set()方法
        // 表示获取当前时间的Calendar对象
//        Calendar calendar = Calendar.getInstance();
//        // 设置指定日期
//        calendar.set(2020,10,6);
//        // 为指定日期增加时间
//        calendar.add(Calendar.DATE,100);
//        // 返回指定日期的年
//        int year = calendar.get(Calendar.YEAR);
//        // 返回指定日期的月
//        int month = calendar.get(Calendar.MONTH);
//        // 返回指定日期的日
//        int date = calendar.get(Calendar.DATE);
//        System.out.println("距现在100天后是：" + year + "年" + month + "月" + date + "日");


//        5.5.3 JDK8的日期与时间类
        // 1、Clock的使用
        Clock clock = Clock.systemUTC();
        System.out.println("获取UTC时区转换的当前时间：" + clock.instant());
        System.out.println("获取UTC时区转换的毫秒数：" + clock.millis());

        // 2、Duration的使用
        Duration d = Duration.ofDays(1);
        System.out.println("一天等于" + d.toHours() + "小时");
        System.out.println("一天等于" + d.toMillis() + "分钟");
        System.out.println("一天等于" + d.toMillis() + "秒");

        // 3、Instant的使用
        Instant instant = Instant.now();
        System.out.println("获取UTC时区的当前时间为：" + instant);
        System.out.println("当前时间一小时后的时间为：" + instant.plusSeconds(3600));
        System.out.println("当前时间一小时前的时间为：" + instant.minusSeconds(3600));

        // 4、LocalDate的使用
        LocalDate localDate = LocalDate.now();
        System.out.println("从默认时区的系统时钟获得当前日期：" + localDate);

        // 5、LocalDateTime的使用
        LocalTime localTime = LocalTime.now();
        System.out.println("从默认时区的系统中获取当前时间：" + localTime);

        // 6、LocalDateTime的使用
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("从默认时区的系统时钟获取日期、时间：" + localDateTime);
        LocalDateTime times = localDateTime.plusDays(1).plusHours(3).plusMinutes(30);
        System.out.println("当前的日期、时间加上1天3小时30分钟之后：" + times);

        // 7、Year、YearMonth、MonthDay的使用
        Year year = Year.now();
        System.out.println("当前年份为：" + year);
        YearMonth yearMonth = YearMonth.now();
        System.out.println("当前年月为：" + yearMonth);
        MonthDay monthDay = MonthDay.now();
        System.out.println("当前月日为：" + monthDay);

        // 8、获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("当前系统默认时区为：" + zoneId);
    }
}
