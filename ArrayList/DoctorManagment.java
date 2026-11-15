package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DoctorManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<FullTimeDoctor> list = new ArrayList<FullTimeDoctor>();
		System.out.println("Enter Number of Doctors : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter id, Name, Specialization, Consultation Fee, Experience");
			int doctorid = sc.nextInt();
			sc.nextLine();
			String doctornameString = sc.next();
			String specializationString = sc.next();
			double consulatationfee = sc.nextDouble();
			int experienceYears = sc.nextInt();

			list.add(new FullTimeDoctor(doctorid, doctornameString, specializationString, consulatationfee,
					experienceYears));
		}

		System.out.println("------All Doctor Details---------");
		for (FullTimeDoctor e : list) {
			e.displayDetails();
		}

		System.out.println("------Sort By Experience------");
		Collections.sort(list);
		for (FullTimeDoctor e : list) {
			e.displayDetails();
		}

		System.out.println("-----Sort By Consultation Fee-------");
		Collections.sort(list, new ConsultationFeeComparator());
		for (FullTimeDoctor e : list) {
			e.displayDetails();
		}

		System.out.println("Enter Id for doctor Search: ");
		int id = sc.nextInt();
		boolean isFound = false;

		for (int i = 0; i <= list.size() - 1; i++) {

			if (list.get(i).doctorId == id) {

				System.out.println("----- Doctor Found -----");

				list.get(i).displayDetails();

				isFound = true;
				break;
			}
		}

		if (isFound == false) {
			System.out.println("Doctor Not Found");
		}

		System.out.println("----Doctor Whose Experience Is than Required ------ ");
		System.out.println("Enter Required Experience: ");
		int requiredExperience = sc.nextInt();

		boolean isFoundd = false;

		for (int i = 0; i <= list.size() - 1; i++) {

			if (list.get(i).experienceYears >= requiredExperience) {

				list.get(i).displayDetails();

				isFoundd = true;
			}
		}

		if (isFoundd == false) {
			System.out.println("No Doctors Found with Required Experience");
		}

		double maxSalary = 0;
		FullTimeDoctor maxDoctor = null;

		for (int i = 0; i <= list.size() - 1; i++) {

			if (list.get(i).calculateMonthlySalary() > maxSalary) {
				maxSalary = list.get(i).calculateMonthlySalary();
				maxDoctor = list.get(i);
			}
		}

		if (maxDoctor != null) {

			System.out.println("----- Doctor With Highest Monthly Salary -----");
			maxDoctor.displayDetails();

		} else {
			System.out.println("No Doctors Available");
		}

	}

}

abstract class Doctor {
	int doctorId;
	String doctorNameString;
	String specialization;
	double consultationFee;

	public Doctor(int doctorId, String doctorNameString, String specialization, double consultationFee) {
		super();
		this.doctorId = doctorId;
		this.doctorNameString = doctorNameString;
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}

	public abstract double calculateMonthlySalary();

	public void displayDetails() {
		System.out.println("Doctor ID : " + doctorId);
		System.out.println("Doctor Name : " + doctorNameString);
		System.out.println("Doctor Specialization : " + specialization);
		System.out.println("Doctor Fee : " + consultationFee);
	}

}

class FullTimeDoctor extends Doctor implements Comparable<FullTimeDoctor> {
	int experienceYears;

	public FullTimeDoctor(int doctorId, String doctorNameString, String specialization, double consultationFee,
			int experienceYears) {
		super(doctorId, doctorNameString, specialization, consultationFee);
		this.experienceYears = experienceYears;
	}

	public double calculateMonthlySalary() {
		return 30000 + (experienceYears * 5000);

	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Experience Years : ");
		System.out.println("Monthly Salary : " + calculateMonthlySalary());
	}

	@Override
	public int compareTo(FullTimeDoctor o) {
		if (o.experienceYears != this.experienceYears) {
			return o.experienceYears - this.experienceYears;
		} else {
			return this.doctorId - o.doctorId;
		}
	}

}

class ConsultationFeeComparator implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		if (o1.consultationFee != o2.consultationFee) {
			return (int) (o1.consultationFee - o1.consultationFee);
		} else {
			return o1.doctorId - o2.doctorId;
		}
	}

}