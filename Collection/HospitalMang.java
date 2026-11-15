package Collection;

import java.util.*;

public class HospitalMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HospitalData hsp = new HospitalData();
		System.out.println("Enter Number of Patients ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter id, Name, Age, Disease");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String disease = sc.next();

			hsp.addPatient(new Patient(id, name, age, disease));
			System.out.println("Patient registered successfully");
		}

		System.out.println("Enter id and Disease for update ");
		int id = sc.nextInt();
		sc.nextLine();
		String newdiease = sc.nextLine();
		hsp.UpdateDisease(id, newdiease);
		System.out.println("Diease updated successfully");

		System.out.println("Enter id for Dispaly patient");
		int displayid = sc.nextInt();
		hsp.displayPatient(displayid);
	}

}

class Patient {
	public int id;
	public String name;
	public int age;
	public String disease;

	public Patient(int id, String name, int age, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + "]";
	}

}

class HospitalData {
	Hashtable<Integer, Patient> patients = new Hashtable<Integer, Patient>();

	public void addPatient(Patient p) {
		patients.put(p.id, p);
	}

	public void UpdateDisease(int id, String newdisease) {
		if (patients.containsKey(id)) {
			patients.get(id).disease = newdisease;
		} else {
			System.out.println("Patient is Not Found ");
		}
	}

	public void trasferPatient(int oldid, int newid) {
		if (!patients.containsKey(oldid)) {
			System.out.println("Patien id not Found");
		} else if (patients.containsKey(newid)) {
			System.out.println("Patient is already Exist");
		}
	}

	public void displayPatient(int id) {
		if (patients.containsKey(id)) {
			System.out.println(patients.get(id));
		} else {
			System.out.println("Patient id not found");
		}
	}

}