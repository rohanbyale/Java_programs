package HashSet;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class OnlineExaminationSystem {
	public static void main(String[] args) {
		RegistraionManager rmManager = new RegistraionManager();
		Scanner sc = new Scanner(System.in);
		acceptRegistrationDetails(rmManager, sc);
		DisplayRegistrationReport(rmManager);

		System.out.println("Enter id for Serch : ");
		int id = sc.nextInt();

		System.out.println(rmManager.searchRegistration(id));

	}

	public static void acceptRegistrationDetails(RegistraionManager rm, Scanner sc) {
		System.out.println("Enter Number of Registration");
		int n = sc.nextInt();
		System.out.println("Enter Registrations ID");
		for (int i = 1; i <= n; i++) {

			rm.addRegistration(sc.nextInt());
		}

	}

	public static void DisplayRegistrationReport(RegistraionManager rm) {
		System.out.println("Total Registeration Attempts : " + rm.registraionAttempts.size());
		System.out.println("Total Unique Attempts : " + rm.getTotalUniqueCount());
		System.out.println("Duplicate Registeration Attemps : " + rm.countDuplicateAttemps());
		rm.displayUniqueRegistration();
		System.out.println("Maximum Registration Frequency : " + rm.getmaximumFrequency());
		rm.displayMostFrequency();

	}

}

class RegistraionManager {
	public Vector<Integer> registraionAttempts = new Vector<Integer>();
	public HashSet<Integer> uniqueRegistrations = new HashSet<Integer>();

	public void addRegistration(int registerid) {
		registraionAttempts.add(registerid);
		uniqueRegistrations.add(registerid);
	}

	public int countDuplicateAttemps() {
		return registraionAttempts.size() - uniqueRegistrations.size();
	}

	public int getTotalUniqueCount() {
		return uniqueRegistrations.size();
	}

	public void displayUniqueRegistration() {
		for (Integer e : uniqueRegistrations) {
			System.out.println(e);
		}
	}

	public int getmaximumFrequency() {

		int maxcount = 0;
		for (int i = 0; i <= registraionAttempts.size() - 1; i++) {
			int count = 0;

			for (int j = 0; j <= registraionAttempts.size() - 1; j++) {
				if (registraionAttempts.get(i) == registraionAttempts.get(j)) {
					count++;
				}
			}

			if (count > maxcount) {
				maxcount = count;

			}

		}

		return maxcount;
	}

	public void displayMostFrequency() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i <= registraionAttempts.size() - 1; i++) {

			map.put(registraionAttempts.get(i), (map.getOrDefault(registraionAttempts.get(i), 0) + 1));
		}

		int maxFrequency = getmaximumFrequency();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxFrequency) {
				System.out.println("Most Frequenct Element : " + entry);
			}
		}

	}

	public boolean searchRegistration(int id) {
		return uniqueRegistrations.contains(id);
	}
}
