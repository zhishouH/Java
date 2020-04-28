package exercise2;

public class Sort {
    public static void  main(String[] args){
        /*假设给定四个整数为1 2 3 4
         * 那么百位可能是1 2 3 4 十位可能是1 2 3 4 个位可能是 1 2 3 4
         * 要求百位 十位 各位上的数字不能重复
         * 比如123，124，132，134都满足条件
         * 而122，121，131，232都不满足条件*/

        //定义长度为4的int数组；
        int[] array = new int[4];
        //创建Scanner对象获取频平台输入信息；
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i = 0;i < array.length;i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j <array.length;j++){
                for(int k = 0; k < array.length;k++){
                    if(array[i] != array[j] && array[j] != array[k] && array[i] != array[k]){
                        int data = array[i] *100 + array[j]*10 + array[k];
                        System.out.println(data);
                    }
                }
            }

        }
    }
}
