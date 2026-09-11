
import java.util.Scanner;

/**
 * BankManagment
 */
public class BankManagment {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int accountNumber = sc.nextInt();
    String name = sc.next();

    sc.nextLine();
    double amount = sc.nextInt();
    double withdrawAmount = sc.nextDouble();

    BankAccount ba = new BankAccount();
    ba.setName(name);
    ba.setNumber(accountNumber);

    System.out.println("Name : " + ba.getName());
    System.out.println("accountNumber " + ba.getNumber());
    ba.deposit(amount);
    ba.withdraw(withdrawAmount);

  }
}

class BankAccount {
  private int accountNumber;
  private String name;
  private Double balance;

  public int getNumber() {
    return accountNumber;
  }

  public void setNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance() {
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance = amount;
  }

  public void withdraw(double withdrawAmount) {
    double finalAmount = getBalance() - withdrawAmount;
    System.out.println("Amount After Withdraw : " + finalAmount);
  }

}