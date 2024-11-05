import java.util.Arrays;

// package 05-11-2024;

public class zerooneknapsack {
    static int wt [] = {10,20,30};
    static int val [] = {60,100,120};
    static int DP[][];
    public static void main(String[] args) {

        int n = 3;
        int w = 50;
        DP = new int[n+1][w+1];

        for(int i = 0; i < DP.length; i++){
                Arrays.fill(DP[i], -1);              
        }
        System.out.println(knapsack(wt,val,w,n));
    }

    static int knapsack(int [] wt, int [] val, int w, int n){
        
        if(n == 0 || w== 0) return 0;
        
        int res ;
        if(wt[n-1] <= w){
            DP[n][w] = Math.max(knapsack(wt, val,w-wt[n-1],n-1),knapsack(wt, val,w,n-1));
        }
        else{
            
            DP[n][w]= knapsack(wt, val,w,n-1);
        }
        return  DP[n][w];
    }


}
//Tabulation