import java.util.Scanner;

public class pfact {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Prime factorization is as follows: ");
        primefactorization(n);
    }

    static void primefactorization(int n) {
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            System.out.print("1 ");
            return;
        }

        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}