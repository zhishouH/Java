import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class Demo6 {
    public static void main(String[] args) {
//        5.6.1 DateFormat类
//        // 创建Date对象
//        Date date = new Date();
//        // Full格式的日期格式器
//        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
//        // Long格式的日期格式器对象
//        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
//        // MEDIUM格式的日期/时间格式器对象
//        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT);
//        // SHORT格式的日期/时间格式器对象
//        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
//
//        System.out.println("当前日期的完整格式为：" + fullFormat.format(date));
//        System.out.println("当前日期的长格式为：" + longFormat.format(date));
//        System.out.println("当前日期的普通格式为：" + mediumFormat.format(date));
//        System.out.println("当前日期的短格式为：" + shortFormat.format(date));
//
//        // 创建DateFormat对象
//        DateFormat dt1 = DateFormat.getDateInstance();
//        // 创建Long格式的Date对象
//        DateFormat dt2 = DateFormat.getDateInstance(DateFormat.LONG);
//        // 定义两个日期格式的字符串
//        String str1 = "2020-10-06";
//        String str2 = "2020年10月6日";
//        System.out.println(dt1.parse(str1));
//        System.out.println(dt2.parse(str2));

//        5.6.2 SimpleDateFormat类
//        // 创建一个SimpleDateFormat对象
//        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
//        // 按SimpleDateFormat对象的日期模板格式化Date对象
//        System.out.println(sdf.format(new Date()));

        // 创建一个SimpleDateFormat对象，并指定日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//        // 定义一个日期格式的字符串
//        String str = "2020/10/06";
//        // 将字符串解析为Date对象
//        System.out.println(sdf.parse(str));

//        5.6.3 DateTimeFormatter类
        //  1、完成日期、时间格式化
//        LocalDateTime date = LocalDateTime.now();
//        // 1、使用常量创建DateTimeFormatter
//        System.out.print("使用常量创建DateTimeFormatter: ");
//        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
//        System.out.println(dtf1.format(date));
//
//        // 2、使用MEDIUM类型风格的DateTimeFormatter
//        System.out.print("使用MEDIUM类型风格的DateTimeFormatter: ");
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        System.out.println(dtf2.format(date));

//        // 3、根据模式字符串来创建DateTimeFormatter格式器
//        System.out.print("根据模式字符串来创建DateTimeFormatter格式器: ");
//        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(date.format(dtf3));

        // 2、解析字符串
        // 定义两种日期格式的字符串
        String str1 = "2018-01-27 12:38:36";
        String str2 = "2018年01月29日15时01分20秒";
        // 定义解析所用的格式器
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
        // 使用LocalDateTime的parse()方法执行解析
        LocalDateTime localDateTime1 = LocalDateTime.parse(str1,formatter1);
        LocalDateTime localDateTime2 = LocalDateTime.parse(str2,formatter2);
        // 输出结果
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);


    }
}
