package LinkedList;

import java.util.*;

public class EmployeeManagment {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EmployeeManager em = new EmployeeManager();
		System.out.println("Enter Number of Employees");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter ID, NAME, SALARY");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			em.ld.add(new Employee(id, name, salary));

		}

		// em.sortEmployee(em.ld);

	}

}

class EmployeeManager {
	public LinkedList<Employee> ld = new LinkedList<Employee>();

	public void sortEmployee(LinkedList<Employee> employees) {

		// Collections.sort(employees);
		Collections.sort(ld);
		Iterator<Employee> itr = ld.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

class Employee implements Comparable<Employee> {
	public int id;
	public String name;
	public double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary != o.salary) {
			return (int) (this.salary - o.salary);
		} else {
			return this.id - o.id;
		}
	}

}