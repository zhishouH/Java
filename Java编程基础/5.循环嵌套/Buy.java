public class Buy {
    public static void main(String[] args) {
        //定义一个变量公鸡为cock,母鸡为hen,小小鸡为chick；
        int cock,hen,chick;
        for(cock = 0;cock <= 20;cock++){
            for(hen = 0;hen <= 33;hen++){
                chick = 100 - cock - hen;
                if(chick%3==0 && cock*5+hen*3+chick/3==100){
                    System.out.println("公鸡："+cock+"只，母鸡："+hen+"只，小小鸡："+chick+"只");
                }
            }
        }
    }
}
