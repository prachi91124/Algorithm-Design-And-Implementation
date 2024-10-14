import java.util.Scanner;
    
        public static void pfactorization(int n){
            if (n < 0) {
                return ;            
            }
            System.out.println(2);
            pfactorization(n/2);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //input number jisske factors nikaalne hh

        pfactorization(n);
    }
}