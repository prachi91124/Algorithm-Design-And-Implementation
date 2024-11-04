// package 04-11-2024;
import java.util.*;

public class dp {
    public static int [] ar1;
    public static int[] ar2;
    public static void main(String[] args) {
        int n = 5;

        
        ar1 = new int[10];
        ar2 = new int[10];
        Arrays.fill(ar1, -1);
        Arrays.fill(ar2,-1);
        System.out.println(fib(n));
        System.out.println(tab(n));

    }
    static int fib(int n){
        if(n <=1) return n;
        
        if(ar1[n]!=  -1) return ar1[n];

        ar1[n] = fib(n-1)+fib(n-2);
        return ar1[n];
    }
    
    static int tab(int n){
        ar2[0] = 0;
        ar2[1] = 1;
    
        for(int i = 2; i <= n; i++){
            ar2[i] = ar2[i-1] + ar2[i-2];
        }
        return ar2[n];
    }
}
