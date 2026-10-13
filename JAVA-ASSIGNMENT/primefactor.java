import java.util.Scanner;

public class primefactor{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Number must be at least 1.");
            return;
        }
        if (n == 1) {
            System.out.println("Prime factorization: 1 has no prime factors.");
            return;
        }

        System.out.print("Prime factorization: ");
        boolean first = true;
        for (int f = 2; (long) f * f <= n; f++) {
            int count = 0;
            while (n % f == 0) {
                n /= f;
                count++;
            }
            if (count > 0) {
                if (!first) System.out.print(" x ");
                System.out.print(f + "^" + count);
                first = false;
            }
        }
        if (n > 1) {            // leftover prime factor
            if (!first) System.out.print(" x ");
            System.out.print(n + "^1");
        }
        System.out.println();
    }
}