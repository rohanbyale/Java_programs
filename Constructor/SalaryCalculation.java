import java.util.Scanner;

public class SalaryCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");

        String name = sc.next();
        System.out.println("Enter Your Basic Salary");
        int basicSalary = sc.nextInt();

        Employee obj = new Employee(name, basicSalary);
        obj.displayDetails();
    }

}

class Employee {
    public String name;
    public int basicSalary;

    public Employee(String name, int basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;

    }

    public double calculateHRA() {
        double hra = (basicSalary * 10) / 100;
        return hra;
    }

    public double calculteDA() {
        double da = (basicSalary * 20) / 100;
        return da;

    }

    public double calculateTotalSalary() {
        double totalSalary = basicSalary + calculateHRA() + calculteDA();
        return totalSalary;

    }

    public void displayDetails() {
        System.out.println("Name = " + name);
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("HRA = " + calculateHRA());
        System.out.println("DA = " + calculteDA());
        System.out.println("Total Salary = " + calculateTotalSalary());

    }

}
