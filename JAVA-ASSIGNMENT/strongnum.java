import java.util.Scanner;

public class strongnum{

    static long factorial(int d) {
        long f = 1;
        for (int i = 2; i <= d; i++) {
            f *= i;
        }
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n;
        long sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        if (isStrong(n)) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }
    }
}