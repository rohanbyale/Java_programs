package ArrayList;

import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rohan", 21, 30000));
		list.add(new Employee("Mohan", 21, 20000));
		list.add(new Employee("Mansh", 21, 10000));
		// we cannot change sorting order of predefined classes comparaTo method already
		// override in integer
		Collections.sort(list);
		System.out.println(list);

	}

}

class Employee implements Comparable<Employee> {
	public String name;
	public int age;
	public double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o) {
		return (int) (this.salary - o.age);

	}

}