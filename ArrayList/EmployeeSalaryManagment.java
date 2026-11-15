package ArrayList;

import java.util.*;

public class EmployeeSalaryManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees : ");
		int n = sc.nextInt();

		ArrayList<PermenatEmployee> emp3 = new ArrayList<PermenatEmployee>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Id, Name, Basic Salary, Bonus Percentage ");
			int employeeid = sc.nextInt();
			sc.nextLine();
			String employeeName = sc.nextLine();
			double basicSalary = sc.nextDouble();
			double bonusPercentage = sc.nextDouble();

			emp3.add(new PermenatEmployee(employeeid, employeeName, basicSalary, bonusPercentage));

		}

		Collections.sort(emp3);
		for (PermenatEmployee e : emp3) {
			e.displayDetails();
		}

		Collections.sort(emp3, (o1, o2) -> (int) (o2.calculateSalary() - o1.calculateSalary()));

		for (PermenatEmployee e : emp3) {
			e.displayDetails();
		}

		System.out.println("Enter Id for Find out Employee");
		int id = sc.nextInt();

		for (PermenatEmployee e : emp3) {
			if (id == e.employeeid) {
				System.out.println(e.employeeName);
				break;

			} else {
				System.out.println("Employee not Found");
			}
		}

	}

}

class Employee03 {
	public int employeeid;
	public String employeeName;
	public double basicSalary;

	public Employee03(int employeeid, String employeeName, double basicSalary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public double calculateSalary() {
		return basicSalary;

	}

}

class PermenatEmployee extends Employee03 implements Comparable<PermenatEmployee> {
	public double bonusPercentage;

	public PermenatEmployee(int employeeid, String employeeName, double basicSalary, double bonusPercentage) {
		super(employeeid, employeeName, basicSalary);
		this.bonusPercentage = bonusPercentage;

	}

	public double calculateSalary() {

		double bonusAmount = basicSalary * bonusPercentage / 100;

		double finalSalry = basicSalary + bonusAmount;
		return finalSalry;
	}

	public void displayDetails() {
		System.out.println("Empoyee Id : " + employeeid);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Basic Salary : " + basicSalary);

		System.out.println("Final Salary : " + calculateSalary());
	}

	@Override
	public int compareTo(PermenatEmployee o) {

		return (int) (this.employeeid - o.employeeid);
	}

}
