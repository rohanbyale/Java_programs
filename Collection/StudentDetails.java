package Collection;

import java.util.Scanner;
import java.util.Vector;

public class StudentDetails {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Student> v = new Vector<>();

		System.out.println("Enter  Number of student");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter  Roll no, name and marks of student : ");

			int rollno = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();

			v.add(new Student(rollno, name, marks));
		}

		for (Student e : v) {
			e.displayDetails();
			System.out.println();
		}

	}
}

class Student {
	public int rollno;
	public String name;
	public double marks;

	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void displayDetails() {
		System.out.println("Student RollNo : " + rollno);
		System.out.println("Student Name :  " + name);
		System.out.println("Student Marks : " + marks);
	}
}