package ArrayList;

import java.util.*;

public class StudentResultManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students ");
		int n = sc.nextInt();
		ArrayList<Student02> student = new ArrayList<Student02>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Stundet Id: , Student Name: , Student Marks");
			int studentid = sc.nextInt();
			sc.nextLine();
			String studentName = sc.nextLine();
			double marks = sc.nextDouble();
			student.add(new Student02(studentid, studentName, marks));

		}

		Collections.sort(student);

		System.out.println(student);
		Collections.sort(student, (o1, o2) -> o1.studentName.compareTo(o2.studentName));
		System.out.println(student);

		System.out.println("Enter Student id for search ");
		int searchid = sc.nextInt();

		for (Student02 e : student) {
			if (e.studentid == searchid) {
//				System.out.println(e);
				e.displayDetails();
				System.out.println(e.getResult());
				break;
			} else {
				System.out.println("No student Matching");
			}
		}

	}

}

class Student02 implements Comparable<Student02> {
	public int studentid;
	public String studentName;
	public double marks;

	public Student02(int studentid, String studentName, double marks) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.marks = marks;

	}

	public String getResult() {
		if (marks >= 40)
			return "pass";
		else
			return "Fail";
	}

	public void displayDetails() {
		System.out.println("Student Id : " + studentid);
		System.out.println("Stundet Name : " + studentName);
		System.out.println("Student Marks : " + marks);
	}

	@Override
	public int compareTo(Student02 o) {
		if (this.marks != o.marks) {
			return (int) (this.marks - o.marks);
		} else {
			return (int) this.studentid - o.studentid;
		}

	}

	@Override
	public String toString() {
		return "Student02 [studentid=" + studentid + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

}


//class StudentNameComparator implements Comparator<Student02> {
//
//	@Override
//	public int compare(Student02 o1, Student02 o2) {
//		return (o1.studentName.compareTo(o2.studentName));
//	}
//}
