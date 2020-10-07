public class Demo {
    public static void main(String[] args) {
        // 5.1 String类与StringBuffer类
//        5.1.1 String类的初始化
//        String str1 = null;
//        String str2 = "";
//        String str3 = "abc";
//        System.out.println(str1 + " " +str2 + " " + str3);

//        String str1 = new String();
//        String str2 = new String("abc");
//        char[] charArray = new char[]{'A','B','C'};
//        String str3 = new String(charArray);
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

//        5.1.2 String类的常见操作
//        String str = "zhishouh-is-a-liangzai-1";
//        String str2 = "zhishouh";
//        System.out.println(str.indexOf("i"));
//        System.out.println(str.lastIndexOf("s"));
//        System.out.println(str.indexOf("hi"));
//        System.out.println(str.lastIndexOf("is"));
//        System.out.println(str.charAt(3));
//        System.out.println(str.endsWith("i"));
//        System.out.println(str.length());
//        System.out.println(str.equals(str2));
//        System.out.println(str.isEmpty());
//        System.out.println(str.startsWith("z"));
//        System.out.println(str.contains("1"));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(String.valueOf(str));
//        System.out.println(str.toCharArray());
//        System.out.println(str.replace("zhishouh","pepsi"));
//        System.out.println(str.split("-"));

//        1、字符串基本操作
//        String s = "abcdefgasdcdef";
//        System.out.println("字符串的长度为： " + s.length());
//        System.out.println("字符串中第一个字符： " + s.charAt(0));
//        System.out.println("字符c第一次出现的位置： " + s.indexOf("c"));
//        System.out.println("字符c最后一次出现的位置： " + s.lastIndexOf("c"));
//        System.out.println("子字符串第一次出现的位置： " + s.lastIndexOf("def"));
//        System.out.println("子字符串最后一次出现的位置： " + s.lastIndexOf("def"));

//        2、字符串的转换操作
//        String str = "java";
//        char[] charArray = str.toCharArray(); // 字符串转换为数组
//        System.out.print("将字符串转为字符数组的遍历结果：");
//        for (int i = 0; i < charArray.length; i++) {
//            if (i != charArray.length-1) {
//                // 如果不是数组的最后一个元素，在元素后面加逗号
//                System.out.print(charArray[i] + ",");
//            } else {
//                // 数组的最后一个元素后面不加逗号
//                System.out.println(charArray[i]);
//            }
//        }
//        System.out.println("将int值转换为String类型之后的结果：" + String.valueOf(12));
//        System.out.println("将字符串转换为大写之后的结果：" + str.toUpperCase());

//        3、字符串的替换和去除空格操作
//        String s = "    http : // localhost : 8080    ";
//        字符串去除空格操作
//        System.out.println("去除字符串两端空格后的结果：" + s.trim());
//        字符串替换操作
//        System.out.println("去除字符串中所有空格后的结果：" + s.replace(" " , ""));

//        4、字符串的判断操作
//        String s1 = "Starter";
//        String s2 = "St";
//        System.out.println("判断是否以字符串St开头：" + s1.startsWith("St"));
//        System.out.println("判断是否以字符串er结尾：" + s1.endsWith("er"));
//        System.out.println("判断是否包含字符串ar：" + s1.contains("ar"));
//        System.out.println("判断字符串是否为空：" + s1.isEmpty());
//        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));

//        == 与 equals
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));

//        5、字符串的截取和分割
//        String str = "2018-01-24";
//        字符串截取操作
//        System.out.println("从第6个字符截取到末尾的结果：" + str.substring(5));
//        System.out.println("从第6个字符截取到第7个字符的结果：" + str.substring(5,7));
//
//        字符串分割操作
//        System.out.print("分割后的字符串数组中的元素依次为：");
//        通过横线连接符“-”将字符串转换为字符串数组
//        String[] strArray = str.split("-");
//        循环输出数组中的元素
//        for (int i = 0; i < strArray.length; i++) {
//            if (i != strArray.length-1) {
//                System.out.print(strArray[i] + "、");
//            } else{
//                System.out.println(strArray[i]);
//            }
//        }

//        5.1.3 StringBuffer类
        System.out.println("1、添加------------------------");
        add();
        System.out.println("2、修改------------------------");
        update();
        System.out.println("3、删除------------------------");
        dedete();
    }

    public static void add() {
        StringBuffer sb = new StringBuffer();
        sb.append("ABC");
        System.out.println("append添加的结果： " + sb);
        sb.insert(3, "DE");
        System.out.println("insert添加的结果：" + sb);
    }
    public static void update() {
        StringBuffer sb = new StringBuffer("ABAAA");
        sb.setCharAt(2,'C');
        System.out.println("修改指定的位置字符结果：" + sb);
        sb.replace(3,5,"DE");
        System.out.println("替换指定位置字符(串)结果：" + sb);
        System.out.println("字符串翻转结果：" + sb.reverse());
    }
    public static void dedete() {
        StringBuffer sb = new StringBuffer("ABCDEFG");
        sb.delete(3,7);
        System.out.println("删除指定位置结果：" + sb);
        sb.deleteCharAt(2);
        System.out.println("删除指定位置结果：" + sb);
        sb.delete(0,sb.length());
        System.out.println("清空缓冲区结果：" + sb);
    }
}