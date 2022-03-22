package ChapterIII;

import java.util.Scanner;
//导包
public class sj {
    public static void main(String[] args) {
//        主函数入口
        Scanner a=new Scanner(System.in );
//        创建函数
        System.out.println("输入数据");
//        屏幕提示输入
        int e= a.nextInt();
//        接受数据
//        以下为判断体
        switch (e){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入数据有误");
//                保证数据的严谨性
        }
    }
}
