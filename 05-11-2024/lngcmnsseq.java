import java.util.*;

public class LCS {
    static int[][] memo;
    static int[][] tab;

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ACE";
        int n1 = 5;
        int n2 = 3;
        memo = new int[n1 + 1][n2 + 1];
        tab = new int[n1 + 1][n2 + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        System.out.println(LCSmemo(s1, s2, n1, n2));
        System.out.println(LCStab(s1, s2, n1, n2));
    }

    static int LCSmemo(String s1, String s2, int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        if (memo[n1][n2] != -1)
            return memo[n1][n2];
        if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1)) {
            memo[n1][n2] = 1 + LCSmemo(s1, s2, n1 - 1, n2 - 1);
        } else {
            memo[n1][n2] = Math.max(LCSmemo(s1, s2, n1 - 1, n2), LCSmemo(s1, s2, n1, n2 - 1));
        }
        return memo[n1][n2];
    }

    static int LCStab(String s1, String s2, int n1, int n2) {
        int[][] tab = new int[n1 + 1][n2 + 1];
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if (i == 0 || j == 0)
                    tab[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    tab[i][j] = 1 + tab[i - 1][j - 1];
                } else {
                    tab[i][j] = Math.max(tab[i - 1][j], tab[i][j - 1]);
                }
            }
        }
        return tab[n1][n2];
    }
}
