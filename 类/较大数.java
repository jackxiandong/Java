package 类;

public class 较大数 {
    public static void main(String[] args) {
        int []arr={12,43,76,367,111};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int x=1;x<arr.length;x++){
            if (arr [x]>max) {
                max=arr[x];
            }
        }
    return max;
    }

}