import java.util.Scanner;

public class lcm {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        long a = sc.nextLong();
        System.out.print("Second number: ");
        long b = sc.nextLong();

        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be positive.");
            return;
        }

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}