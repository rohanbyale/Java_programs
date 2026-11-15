package Collection;
import java.util.*;

public class EmployeeDetails {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Vector<Employee> v = new Vector<>();
		
		int n = sc.nextInt();
		System.out.println("Enter id , Name, Salary");
		for(int i = 0; i<n; i++) {
			int id = sc.nextInt();
			String empName = sc.next();
			double salary = sc.nextDouble();
			
			v.add(new Employee(id,empName,salary));
			
			for(Employee e : v) {
				e.displayDetails();
				System.out.println();
			}
		}
		
		
	}

}

class Employee{
	
	public int id;
	public String empName;
	public double salary;
	
	public Employee(int id, String empName, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary+ (salary * 10 / 100);
	}
	
	public  void displayDetails() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Final Salay "+calculateSalary());
		
	}
}
