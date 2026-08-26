import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account balance");
        double accountBalance = sc.nextDouble();
        System.out.println("Enter Amount To Deposit");
        double deposit = sc.nextInt();
        System.out.println("Enter amount to withdrawn");
        double withdraw = sc.nextDouble();

        MobileApp obj = new MobileApp(accountNumber, accountBalance);
        obj.depositAccount(deposit);
        obj.withDraw(withdraw);
        System.out.println("Final available balance: " + obj.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double accountBalance;

    public BankAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void depositAccount(double amount) {

        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Amount of " + amount + " Is deposited");
        } else {
            System.out.println("Invalid Amount");
        }

    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Wthdrawl of " + amount + " is done succesfully");

        } else {
            System.out.println("Invalid withdrawl Amount");
        }
    }

    public double getBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}

class MobileApp extends BankAccount {

    public MobileApp(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    public void withDraw(double amount) {
        if (amount > 25000) {
            System.out.println("Daily limit is exceeded");
        } else {
            super.withDraw(amount);
        }
    }

}