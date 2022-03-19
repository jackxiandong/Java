package 类;

public class 数组内容 {
    public static void main(String[] args) {
        int []as={12,13,14,15};
        int []ad={12,13,14,15};
        boolean fe=qq(as,ad);
        System.out.println(fe);
    }
    public static boolean qq(int []as,int []ad){
        if (as.length!=ad.length){
            return false;
        }
        for (int x =0;x<as.length;x++){
            if (as[x]!=ad[x]){
                return false;
            }
        }
        return true;
    }
}
