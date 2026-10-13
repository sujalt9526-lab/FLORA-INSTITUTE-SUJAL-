import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Holder: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Initial Balance: ");
        double initial = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, initial);
        if (!acc.isValid()) {
            System.out.println("Invalid initial balance!");
            return;
        }

        System.out.print("Deposit: ");
        double dep = sc.nextDouble();
        System.out.print("Withdrawal: ");
        double wd = sc.nextDouble();

        System.out.println();
        System.out.println("Account Holder: " + acc.getHolderName());
        System.out.println("Account Number: " + acc.getAccountNumber());
        acc.deposit(dep);
        acc.withdraw(wd);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}

class BankAccount {
    private String holderName;
    private int accountNumber;
    private double balance;
    private boolean valid;

    public BankAccount(String holderName, int accountNumber, double initialBalance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
            this.valid = true;
        } else {
            this.balance = 0;
            this.valid = false;
        }
    }

    public boolean isValid() {
        return valid;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit Failed: amount must be positive");
        } else {
            balance += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal Failed: amount must be positive");
        } else if (amount > balance) {
            System.out.println("Withdrawal Failed: insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public double getBalance() { return balance; }
    public String getHolderName() { return holderName; }
    public int getAccountNumber() { return accountNumber; }
}