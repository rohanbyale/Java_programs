import java.util.Scanner;

/**
 * BankAccountDetails
 */
public class BankAccountDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a accountnumber : ");
        long accountNumber = sc.nextLong();
        System.out.println("Enter Name : ");
        String name = sc.next();
        System.out.println("Enter Amount : ");
        double amount = sc.nextDouble();

        BankAccount bk = new BankAccount();
        bk.setAccountNumber(accountNumber);
        bk.setName(name);
        bk.setDeposit(amount);

        System.out.println("Account Number : " + bk.getAccountNumber());
        System.out.println("Name : " + bk.getName());
        System.out.println("Balance : " + bk.getBalace());

    }
}

class BankAccount {
    private long accountNumber;
    private String name;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        if(accountNumber<=0){
            System.out.println("Enter a Valid Account Number");
        } else{
            this.accountNumber = accountNumber;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalace() {
        return balance;

    }

    public void setDeposit(double amount) {
        if(amount <= 0){
            System.out.println("Enter a Valid Marks");
        } else{
            this.balance = amount;
        }
    }
}