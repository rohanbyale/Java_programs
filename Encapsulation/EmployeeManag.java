import java.util.Scanner;

public class EmployeeManag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        String empName = sc.nextLine();
        double empSalary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        // Pass 3 arguments to HR constructor
        HR ob = new HR(empId, empName, empSalary);

        // Update salary using HR's overridden method
        ob.setSal(newSalary);

        // Display updated details
        ob.displayDetails();

        sc.close();
    }
}

class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getId() {
        return empId;
    }


    public String getName() {
        return empName;
    }


    public double getSal() {
        return empSalary;
    }

    public void setSal(double newSalary) {
        if (newSalary < 0) {
            System.out.println("Invalid Salary");
        } else {
            System.out.println("Updated Salary");
            this.empSalary = newSalary;
        }
    }

    public void displayDetails() {
        System.out.println("ID : " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSalary);
    }
}

class HR extends Employee {
    public HR(int empId, String empName, double empSalary) {
        super(empId, empName, empSalary);
    }

    @Override
    public void setSal(double newSalary) {
        if (newSalary > 1.5 * getSal()) {
            System.out.println("Increment limit exceeded");
        } else {
            super.setSal(newSalary);
        }
    }
}