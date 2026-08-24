package SingleLevel;

import java.util.Scanner;

class BonusSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        String name = sc.next();

        System.out.println("Enter the Employee Id: ");
        int id = sc.nextInt();

        System.out.println("Enter the basic Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the Bonus: ");
        double bonus = sc.nextDouble();

        BonusEmployee obj = new BonusEmployee(name, id, salary, bonus);
        obj.calculateSalary();
        // System.out.println(obj.calculateSalary());
    }

}

class Employee {
    public String name;
    public int id;
    public double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public void displayDetails() {
        System.out.println("Name :" + name);
        System.out.println(" id " + id);
        System.out.println("salary " + salary);
        System.out.println("Final salary" + calculateSalary());
    }

    public double calculateSalary() {
        return salary;
    }

}

class BonusEmployee extends Employee {
    public double bonus;

    public BonusEmployee(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        System.out.println("basic salary: " + super.calculateSalary());
        System.out.println("Bonus" + bonus);
        return super.calculateSalary() + bonus;
    }
}