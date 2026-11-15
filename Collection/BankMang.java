package Collection;

import java.util.*;

public class BankMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<BankAccount> v = new Vector<>();

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter account number, holder name, balance");
			int accNumber = sc.nextInt();
			sc.hasNextLine();
			String name = sc.next();
			double balance = sc.nextDouble();

			v.add(new BankAccount(accNumber, name, balance));

		}
		BankAccount firstAccount = v.get(0);
		firstAccount.deposit(2000);
		firstAccount.withdraw(500);

		for (BankAccount e : v) {
			e.displayDetails();
			System.out.println();
		}
	}

}

class BankAccount {
	private int accNumber;
	private String name;
	private double balance;

	public BankAccount(int accNumber, String name, double balance) {

		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {

		if (amount >= 0) {
			System.out.println("Amount of " + amount + " is deposited successfully");
			balance += amount;
		} else {
			System.out.println("Invalid Amount ");
		}
	}

	public void withdraw(double amount) {
		if (amount >= 0 && amount <= balance) {
			System.out.println("Amount of " + amount + " is deposited successfully");
			balance -= amount;
		} else {
			System.out.println("Invalid Amount ");
		}
	}

	public void displayDetails() {
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Number : " + accNumber);
		System.out.println("Account Balance : " + balance);
	}
}
