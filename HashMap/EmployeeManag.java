package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManag {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeManagment em = new EmployeeManagment();
		int choice = 0;
		do {
			System.out.println("1: add Employee : 2: Search 3: Update 4: Delete 5: Display 6: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.println("Enter Id , name, dept, and salary");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				String dept = sc.nextLine();
				double salary = sc.nextDouble();
				em.addEmployee(new Employee01(id, name, dept, salary));
			}

			case 2 -> {
				System.out.println("Enter id for Search : ");
				int id = sc.nextInt();
				System.out.println("Employee Found : " + em.searchEmployee(id));
			}

			case 3 -> {
				System.out.println("Enter id: and Salary to Update");
				int id = sc.nextInt();
				sc.nextLine();
				double newsalary = sc.nextDouble();
				System.out.println("Update Salary Status : " + em.updateSalary(id, newsalary));
			}

			case 4 -> {
				System.out.println("Enter id : for Delete : ");
				int id = sc.nextInt();
				System.out.println("Delete Employee Status : " + em.deleteEmployee(id));
			}

			case 5 -> {
				em.displayEmployee();
			}

			}

		} while (choice != 6);

	}

}

class EmployeeManagment {
	public HashMap<Integer, Employee01> map = new HashMap<Integer, Employee01>();

	public void addEmployee(Employee01 emp) {
		map.put(emp.getId(), emp);
		System.out.println("Employee: " + emp.getName() + " is added Successfully");
	}

	public Employee01 searchEmployee(int id) {
		Employee01 emp = null;
		if (map.containsKey(id)) {
			emp = map.get(id);

		}
		return emp;

	}

	public boolean updateSalary(int id, double newsalary) {
		if (map.containsKey(id)) {
			map.get(id).setSalary(newsalary);

			return true;

		} else {
			return false;
		}

	}

	public boolean deleteEmployee(int id) {
		if (map.containsKey(id)) {
			map.remove(id);
			return true;
		} else {
			return false;
		}
	}

	public void displayEmployee() {
		for (Employee01 emp : map.values()) {
			System.out.println(emp);
		}
	}

}

class Employee01 {
	private int id;
	private String name;
	private String dept;
	private double salary;

	public Employee01(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptl() {
		return dept;
	}

	public void setDeptl(String deptl) {
		this.dept = deptl;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee01 id : " + id + ", name : " + name + ", dept : " + dept + ", salary : " + salary + "]";
	}

}