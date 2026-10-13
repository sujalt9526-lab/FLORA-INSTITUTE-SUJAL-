import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        int largest = -1, second = -1;

        while (n > 0) {
            int d = n % 10;
            n /= 10;

            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d < largest && d > second) {
                second = d;
            }
        }

        if (second == -1)
            System.out.println("Fewer than two distinct digits exist.");
        else
            System.out.println("Second-largest distinct digit: " + second);
    }
}