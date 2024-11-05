// package 05-11-2024;
import java.util.Arrays;
public class lngcmnsseq {
    static int [] [] dp1;
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ACE";
        int n1 = 5;
        int n2 = 3;
        dp1 = new int [n1+1][n2+1];

        for(int [] row : dp1){
            Arrays.fill(row, -1);
        }
        System.out.println(LCShelper(s1,s2,n1,n2));
    }

    static int LCShelper(String s1, String s2, int n1, int n2){
        if(n1 ==0 || n2 == 0) return 0;

        if(dp1[n1][n2] != -1) return dp1[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            dp1[n1][n2] = 1 + LCShelper(s1, s2, n1-1, n2-1);
        }
        else{
            dp1[n1][n2] = Math.max(LCShelper(s1, s2, n1-1, n2), LCShelper(s1, s2, n1, n2-1));
        }
        return dp1[n1][n2];
    }
}
