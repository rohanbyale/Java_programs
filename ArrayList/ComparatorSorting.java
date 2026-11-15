package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSorting {
	public static void main(String[] args) {
		ArrayList<Employee01> list = new ArrayList<Employee01>();
		list.add(new Employee01("Rohan", 31, 30000));
		list.add(new Employee01("Mohan", 21, 20000));
		list.add(new Employee01("Mansh", 11, 10000));
		// we cannot change sorting order of predefined classes comparaTo method already
		// override in integer
		 Collections.sort(list,new MyComparator());
		//Collections.sort(list, (o1, o2) -> o1.age - o2.age);
		//Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
		System.out.println(list);

	}

}

class MyComparator implements Comparator<Employee01>{

	@Override
	public int compare(Employee01 o1, Employee01 o2) {
		return (int) (o1.salary - o2.salary);
	}
}

class Employee01 {
	public String name;
	public int age;
	public double salary;

	public Employee01(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}