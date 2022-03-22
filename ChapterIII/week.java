package ChapterIII;

import java.util.Scanner;
//导包
public class week {
    public static void main(String[] args) {
        //主函数入口
        System.out.println("开始");
        Scanner aa=new Scanner(System.in);
        //创建函数
        System.out.println("输入星期");
        int a= aa.nextInt();
        //接受函数
        //以下为判断方法
        if (a == 1) {
            System.out.println("星期一");
        }
        else if (a == 2) {
            System.out.println("星期二");
        }
        else if (a == 3) {
            System.out.println("星期三");
        }
        else if (a == 4) {
            System.out.println("星期四");
        }
        else if (a == 5) {
            System.out.println("星期五");
        }
        else if (a == 6) {
            System.out.println("星期六");
        }
        else if (a == 7) {
            System.out.println("星期天");
        }
        else {
            System.out.println("输入错误");
        }
    }
}
