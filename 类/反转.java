package 类;

public class 反转 {
    public static void main(String[] args) {
        int []arr={19,28,37,46,50};
        aas(arr);
        qw(arr);

    }
    public static void aas(int[]arr){

        for (int st=0,en=arr.length-1;st<=en;st++,en--){
            int te=arr[st];
            arr[st]=arr[en];
            arr[en]=te;
        }
    }
    public static void qw(int []arr){
        System.out.println("[");
        for (int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }

}
