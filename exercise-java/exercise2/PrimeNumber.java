package exercise2;

public class PrimeNumber {
    public static void main(String[] args){
        //找出1到1000以内的质数；
        // 质数为只能被1和它本身整数的数，除了1和2外；
        System.out.println(2+" ");
        //因为偶数中只有2是质数，所以将2直接输出；
        OUT:
        for(int i = 3;i <= 1000;i+=2){
            //1不是质数，2是质数已经输出，所以循环从3开始，i+=2是因为循环中我们不再考虑偶数；
            for(int j = 2;j < i;j++){
                if(i%j==0){
                    //如果i对j求余等于0说明i不是质数；
                    continue OUT;
                }
            }
            System.out.println(i+" ");
        }
    }
}
