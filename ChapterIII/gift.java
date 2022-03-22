package ChapterIII;

import java.util.Scanner;

public class gift {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        int s= aa.nextInt();
        if (s <60) {
            System.out.println("打一顿");
        }
        else if (s == 60) {
            System.out.println("买奥特曼");
        }
        else if (s<=80){
            System.out.println("3090");
        }
        else if (s<=95) {
            System.out.println("rog全家桶");
        }
        else if(s<=100){
            System.out.println("飞机模型");
        }
        else{
            System.out.println("成绩有错误");
        }
    }
}
