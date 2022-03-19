package 类;

public class 数组求和 {
    public static void main(String[] args) {
        int [] ae ={68,27,95,88,171,996,51,210};
        int sum=0;
        for (int x =0;x<ae.length;x++){
            if(ae[x]%10!=7&&ae[x]/10%10!=7&&ae[x]%2==0){
                sum+=ae[x];
            }
        }
        System.out.println(sum);
    }
}
