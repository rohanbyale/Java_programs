package ArrayList;

import java.util.*;

public class StudentSorting {
	public static void main(String[] args) {

		ArrayList<Student> std = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Student");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Name, Marks,RollNo ");
			String name = sc.next();
			int marks = sc.nextInt();
			sc.nextLine();
			int rollNo = sc.nextInt();
			std.add(new Student(name, marks, rollNo));

		}

		Collections.sort(std);
		System.out.println(std);

	}

}

class Student implements Comparable<Student> {
	public String name;
	public int marks;
	public int rollNo;

	public Student(String name, int marks, int rollNo) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks != o.marks)
			return o.marks - this.marks;
		else
			return this.rollNo - o.rollNo;
	}

}