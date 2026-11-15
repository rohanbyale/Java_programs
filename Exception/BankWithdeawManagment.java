package Exception;
import java.util.*;

public class BankWithdeawManagment {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name,initial balance, and withdrawal amount");
	String name = sc.nextLine();
	double balance = sc.nextDouble();
	double amount = sc.nextDouble();
	
	
BankAccount ba = new BankAccount(name,balance);
try {
	ba.withdraw(amount);
}
catch( InsufficeantBalanaceException e) {
	System.out.println(e.getMessage());
	
}
System.out.printf("Remaining Balance: %.2f",ba.getBlanace());


}

}

class InsufficeantBalanaceException  extends Exception{

	public InsufficeantBalanaceException(String message) {
		super(message);
	}
	
	
}

class BankAccount {
	private String name;
	private double blanace;
	public BankAccount(String name, double blanace) {
	
		this.name = name;
		this.blanace = blanace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBlanace() {
		return blanace;
	}
	public void setBlanace(double blanace) {
		this.blanace = blanace;
	}
	
	
	public void withdraw(double amount) throws InsufficeantBalanaceException  {
		
		if(amount <= 0) {
			throw new InsufficeantBalanaceException("Invalid Withdeaw amount");
		}
		
		else if(amount > blanace) {
			
			throw new InsufficeantBalanaceException("Baalance limiy");
		} else {
			blanace -= amount;
		System.out.println("Withdrawal Successfully ");
		}
	}
	
	
}






