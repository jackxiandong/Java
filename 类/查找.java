package 类;

import java.util.Scanner;

public class 查找 {
    public static void main(String[] args) {
        int []aa={12,43,57,86,93,104};
        Scanner ac=new Scanner(System.in);
        int as =ac.nextInt();
        int av=da(aa,as);
        System.out.println(av);

    }
    public  static int da(int[]aa,int as){
        int aaa=-1;
        for (int x =0;x>aa.length;x++){
            if (aa[x]==as){
                aaa=x;
                break;
            }
        }
        return aaa;
    }


}
