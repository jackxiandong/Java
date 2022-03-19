package 类;

import java.util.Scanner;

public class 乘法表 {
    public static void main(String[] args) {
//        Scanner ac=new Scanner(System.in);
//        int j= ac.nextByte();
        for (int a =1;a<=9;a++) {
            for ( int i =1;i<=9;i++){
                System.out.print(i);
                System.out.print("*");
                System.out.print(a);
                System.out.print("=");
                System.out.print(i*a);
                System.out.println();
            }
        }
    }
}
