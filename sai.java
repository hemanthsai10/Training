import java.util.*;
class sai{
    public static void main(String[]ar){
        Scanner th=new Scanner(System.in);
        int t=th.nextInt();
        Fact(t);
    }
    public static void Fact(int t){
        int min=0;
        int fac=0;
        for(int i=1;i<t;i++){
            if(t%i==0){
                min=i;
                break;
            }
        }
        for(int i=1;i<t;i++){
            if(min*i==t){
                fac=i;
                break;
            }
        }
        System.out.println(min+""+fac);
    }
}