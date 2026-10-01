import java.util.*;

public class BankAccountManagment {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        String accountType = sc.nextLine();
        String accountHoldername = sc.nextLine();
        double balance = sc.nextDouble();
        sc.nextLine();
        String number1 = sc.nextLine();
        String accountType1 = sc.nextLine();
        String accountHoldername1 = sc.nextLine();
        double balance1 = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Error: Balance must be non-negative");
            return;
        }

        BankAccount ob = new BankAccount(number, accountType, accountHoldername, balance);
        BankAccount ob2 = new BankAccount(number1, accountType1, accountHoldername1, balance1);

        if (ob.equals(ob2)) {
            System.out.println("Accounts are equal");
        } else {
            System.out.println("Accounts are not equal");
        }

    }
}

class BankAccount {
    public String number;
    public String accountType;
    public String accountHoldername;
    public double balance;

    public BankAccount(String number, String accountType, String accountHoldername, double balance) {
        this.number = number;
        this.accountType = accountType;
        this.accountHoldername = accountHoldername;
        this.balance = balance;
    }

    public boolean equals(Object obj) {
        BankAccount other = (BankAccount) obj;
        return Objects.equals(number, other.number) && Objects.equals(accountType, other.accountType);

    }
}
