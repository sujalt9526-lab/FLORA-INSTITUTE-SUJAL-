import java.util.Scanner;

public class studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter 5 marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        Student s = new Student(name, roll, m1, m2, m3, m4, m5);
        if (!s.isValid()) {
            System.out.println("Invalid marks! Each mark must be between 0 and 100.");
            return;
        }
        System.out.println();
        s.displayResult();
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int m1, m2, m3, m4, m5;
    private boolean valid;

    public Student(String name, int rollNumber, int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.valid = isMarkValid(m1) && isMarkValid(m2) && isMarkValid(m3)
                && isMarkValid(m4) && isMarkValid(m5);
    }

    private boolean isMarkValid(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public boolean isValid() {
        return valid;
    }

    public int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String getResultStatus() {
        if (m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40) {
            return "PASS";
        }
        return "FAIL";
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + getResultStatus());
    }
}