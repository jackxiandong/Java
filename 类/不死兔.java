package 类;

public class 不死兔 {
    public static void main(String [] args){
        int [] aee=new int [20];
        aee[0]=1;
        aee[1]=1;
        for (int x=2;x<aee.length;x++){
            aee[x]=aee[x-2]+aee[x-1];
        }
        System.out.println(aee[19]);
    }

}
