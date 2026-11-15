package TreeMap;

import java.util.*;

public class EmployeeMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeMangament ob = new EmployeeMangament();
		int choice = 0;
		System.out.println("1 Register 2 Search Employee 3 All Employee 4 Display Employee 6 Exist ");
		
		do {
			choice = sc.nextInt();
			swtich(choice){
				case 1 ->{
					int id = sc.nextInt();
					sc.nextLine();
					String name = sc.nextLine();
					double salary = sc.nextDouble();
					String dept = sc.nextLine();
					
					map.put(new Employee(id, name, salary, dept));
					
					
				}
				
			}
		}while(choice != 6) ;

	}

}

class EmployeeMangament {
	TreeMap<Integer, Employee> map = new TreeMap<Integer, Employee>();

	public void addEmployee(Employee emp) {
		if (!map.containsKey(emp.getEmployeeid())) {
			map.put(emp.getEmployeeid(), emp);
			System.out.println("Employee " + emp.getEmployeeName() + " is Added");
		} else {
			System.out.println("Employee Already Added");
		}
	}

	public Employee EmployeeFound(int id) {
		Employee temp = null;

		if (map.containsKey(id))
			temp = map.get(id);

		return temp;
	}

	public void DisplayDetails() {

		if (map.isEmpty()) {
			System.out.println("Three is no one");
			return;
		}
		for (Employee e : map.values()) {
			System.out.println(e);
		}
	}

	public int getTotalEmlployees() {
		return map.size();
	}
}

class Employee implements Comparable<Employee> {
	private int employeeid;
	private String employeeName;
	private double salary;
	private String department;

	public Employee(int employeeid, String employeeName, double salary, String department) {
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	public int compareTo(Employee o) {
		return this.getEmployeeid() - o.getEmployeeid();
	}

}
