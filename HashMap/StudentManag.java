package HashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentManag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AttendanceManagment am = new AttendanceManagment();
		int choice = 0;

		do {
			System.out.println("1 Register 2 update 3 search 4 display 5 StudentPresent 6 Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.println("Enter id, StudentName, Attendance Status : ->->");
				int id = sc.nextInt();
				sc.nextLine();
				String personName = sc.nextLine();
				String status = sc.nextLine();
				am.markAttendance(new Student(id, personName, status));

			}

			case 2 -> {
				System.out.println("Enter id and Status for update : ");
				int id = sc.nextInt();
				sc.nextLine();
				String status = sc.nextLine();
				am.updateAttendence(id, status);
			}

			case 3 -> {
				System.out.println("Enter id for Search  : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println(am.searchStudent(id));
			}

			case 4 -> {
				System.out.println("Enter id for Display Attendance : ");

				am.displayAttendance();

			}

			case 5 -> {
				System.out.println("Student Present for Todays Class : " + am.countStundetPresent());

			}

			}

		} while (choice != 6);
	}

}

class Person {
	int personid;
	String personName;

	public Person(int personid, String personName) {

		this.personid = personid;
		this.personName = personName;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person personid : " + personid + ", personName : " + personName;
	}

}

class Student extends Person {
	private String attendenceStatus;

	public Student(int personid, String personName, String attendenceStatus) {
		super(personid, personName);
		this.attendenceStatus = attendenceStatus;

	}

	public String getAttendenceStatus() {
		return attendenceStatus;
	}

	public void setAttendenceStatus(String attendenceStatus) {
		this.attendenceStatus = attendenceStatus;
	}

	@Override
	public String toString() {
		return "Student personid = " + personid + ", personName = " + personName + " attendenceStatus = "
				+ attendenceStatus;
	}

}

class AttendanceManagment {
	LinkedHashMap<Integer, Student> map = new LinkedHashMap<Integer, Student>();

	public void markAttendance(Student std) {

		map.put(std.getPersonid(), std);

	}

	public void updateAttendence(int id, String status) {
		if (map.containsKey(id)) {
			map.get(id).setAttendenceStatus(status);
		} else {
			System.out.println("Student id not found ");
		}
	}

	public Student searchStudent(int id) {
		Student std = null;
		if (map.containsKey(id)) {
			std = map.get(id);
		}
		return std;
	}

	public void displayAttendance() {
		for (Student std : map.values()) {
			System.out.println(std.getPersonName() + " Status : " + std.getAttendenceStatus());
		}
	}

	public int countStundetPresent() {
		int count = 0;
		for (Student std : map.values()) {
			if (std.getAttendenceStatus().equals("Present")) {
				count++;
			}

		}
		return count;
	}

}
