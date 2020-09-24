public class Conversion {
    public static void  main(String[] args) {
        String str1 = "HelloWorld";
        StringBuffer str2 = new StringBuffer();
        for (int i = str1.length()-1; i >= 0; i--) {
            Character ch = str1.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            else{
                ch = Character.toUpperCase(ch);
            }
            str2.append(ch);
        }
        System.out.println(str2);
    }
}
