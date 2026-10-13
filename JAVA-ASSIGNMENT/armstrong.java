import java.util.Scanner;

public class armstrong{

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    static boolean isArmstrong(int n) {
        int digits = countDigits(n);
        long sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += power(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        if (start < 1 || end < start) {
            System.out.println("Please enter valid positive integers.");
            return;
        }

        System.out.print("Armstrong numbers:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}