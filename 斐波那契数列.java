package 类;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        climbStairs (n);
    }
        private static Map<Integer, Integer> storeMap = new HashMap<>();
        public static int climbStairs(int n){
            if (n == 1) return 1;
            if (n == 2) return 2;
            if (null != storeMap.get(n))
                return storeMap.get(n);
            else {
                int result = climbStairs(n - 1) + climbStairs(n - 2);
                storeMap.put(n, result);
                return result;

            }

        }
    }