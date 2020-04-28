package exercise2;

public class Buy {
    public static void main(String[] args){
// 养鸡大户王大喜，用百元钱买百鸡， 公鸡每只五元整，三元一只是母鸡，
// 小小鸡崽价钱低，一元正好买三只， 公鸡母鸡和小鸡，请你算算各是几？
        int cock,hen,chick;
        for(cock=0;cock<=20;cock++){
            for(hen=0;hen<=33;hen++){
                chick = 100 - cock - hen;
                if(chick%3==0 && cock*5+hen*3+chick/3==100){
                    System.out.println("公鸡："+cock+"只，母鸡："+hen+"只，小小鸡："+chick+"只");
                }
            }
        }
    }
}
