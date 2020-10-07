import java.util.*;
import java.io.IOException;
public class Demo2 {
    public static void main(String[] args) throws Exception{
//       5.2.1 System类
//        1、getProperties()方法
//        获取当前系统属性
//        Properties properties = System.getProperties();
//        System.out.println(properties);
//       获取所有系统属性的key(属性名)，返回Set对象
//        Set<String>propertyNames = properties.stringPropertyNames();
//        for (String key:propertyNames) {
//           获取当前键key(属性名)所对应的值(属性值)
//            String value = System.getProperty(key);
//            System.out.println(key + "--->" + value);
//        }
//        2、currentTimeMillis()
//        long startTime = System.currentTimeMillis();
//        int sum = 0;
//        for (int i = 0; i < 100000000; i++) {
//            sum += i;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("程序运行时间为：" + (endTime - startTime) + "毫秒");

//        3、arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
//           int[] srcArray = {101,102,103,104,105,106};
//           int[] destArray = {201,202,203,204,205};
//           System.arraycopy(srcArray,2,destArray,0,4);
//           for (int i = 0; i < destArray.length; i++) {
//               System.out.println(i + ": " + destArray[i]);
//           }

//        5.2.2 Runtime类
//        Runtime rt = Runtime.getRuntime();
//        System.out.println("处理器的个数：" + rt.availableProcessors() + "个");
//        System.out.println("空闲内存大小：" + rt.freeMemory()/1024/1024 + "M");
//        System.out.println("最大可用内存大小：" + rt.maxMemory()/1024/2014 + "M");

//            Runtime rt = Runtime.getRuntime();
//            rt.exec("notepad.exe");

        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
