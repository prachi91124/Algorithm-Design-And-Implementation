// package 04-11-2024;
//count number of ways

import java.util.Arrays;

public class cntnoofways {
    public static int ar1 [];
    public static int ar2[];
        public static void main(String[] args) {
            int n  = 6;
            ar1 = new int[n+2];
            ar2 = new int[n+2];

            Arrays.fill(ar1, 0);
            Arrays.fill(ar2, 0);

            System.out.println(memo(n));
            System.out.println(tab(n));
        }

        static int memo(int n){
            if(n < 0) return 0;
            if(n==0) return 1;
            if(ar1[n]  != 0) return ar1[n];

            ar1[n] = memo(n-1)+ memo(n-2)+ memo(n-3);
            return ar1[n];
        }

        static int tab(int n){
            ar2[0] = 1;
            
            for(int i = 1; i <= n; i++){
                ar2[i] += ar2[i-1];
                if(i>=2) ar2[i] += ar2[i-2];
                if(i>=3) ar2[i] += ar2[i-3];
            }
            return ar2[n];
        }
}
