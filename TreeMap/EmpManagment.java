package TreeMap;

import java.util.*;

public class EmpManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PerformanceManager pm = new PerformanceManager();
		System.out.println("Enter Number of Employees");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Id, name, Department, Performance Score , Bonus");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String deparmatemnt = sc.nextLine();
			double score = sc.nextDouble();
			double bonus = sc.nextDouble();

			pm.RegisterEmployee(new Employee01(id, name, deparmatemnt, score), bonus);
		}

		pm.displayEmployees();

		System.out.println("Lowest Highest Performance Score");
		pm.highestPerfomace();
		System.out.println("Lowerst Performace Score");
		pm.lowestPerformance();
		pm.AverageScore();
		pm.SecondHighest();
		pm.HighestAnnualBonus();

	}

}

class PerformanceManager {
	TreeMap<Employee01, Double> map = new TreeMap<Employee01, Double>();

	public void RegisterEmployee(Employee01 emp, double bonus) {
		map.put(emp, bonus);
	}

	public void displayEmployees() {
		for (Employee01 e : map.keySet()) {
			System.out.println(e);
		}
	}

	public void highestPerfomace() {
		System.out.println("Highest Performance Score " + map.firstKey());
	}

	public void lowestPerformance() {
		System.out.println("Lowest Performace Score " + map.lastKey());
	}

	public void AverageScore() {
		double sum = 0;
		for (Employee01 e : map.keySet()) {
			sum += e.getScore();

		}

		System.out.println("Average Performance Score : = " + sum / map.size());
	}

	public void SecondHighest() {

		// ArrayList<Map.Entry<Employee01, Double>> aList = new
		// ArrayList<Map.Entry<Employee01,Double>>();
//		map.remove(map.firstKey());
//		System.out.println("Second Highest Performance : "+map.firstKey());
		System.out.println("Second Highest Performance : " + map.higherKey(map.firstKey()));
	}

	public void HighestAnnualBonus() {
		Employee01 highestBonusEmployee01 = null;
		double highestBonus = 0;

		for (Map.Entry<Employee01, Double> entry : map.entrySet()) {
			if (entry.getValue() > highestBonus) {
				highestBonusEmployee01 = entry.getKey();
			}

			System.out.println("Highest Bonus Employee : " + highestBonusEmployee01);
		}
	}

}

class Employee01 implements Comparable<Employee01> {
	private int id;
	private String name;
	private String dept;
	private double score;

	public Employee01(int id, String name, String dept, double score) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public double getScore() {
		return score;
	}

	@Override
	public int compareTo(Employee01 o) {
		if (o.getScore() != this.getScore()) {
			return (int) (o.getScore() - this.getScore());
		} else {
			return this.getId() - o.getId();
		}

	}

}