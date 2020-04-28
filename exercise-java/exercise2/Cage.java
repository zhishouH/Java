package exercise2;

public class Cage {
    public static void main(String[] args){
        //有若干只鸡兔同在一个笼子里，从上面数，有35个头,从下面数，有94只脚。问笼中各有几只鸡和兔？
        int chick,rabbit,foot;
        for(chick=0;chick<=35;chick++){
            rabbit=35-chick;
            foot=2*chick+4*(35-chick);
            if(foot==94){
                
                System.out.println("鸡有："+chick+"只，兔有："+rabbit+"只");
            }
        }
    }
}
