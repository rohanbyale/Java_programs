import java.util.Scanner;

class EmpSalaryMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeId = sc.nextInt();
        String empname = sc.next();
        double salary = sc.nextDouble();
        double percentage = sc.nextDouble();

        Employee emp = new Employee();
        emp.setId(employeeId);
        emp.setName(empname);
        emp.setSal(salary);
        emp.increaseSalary(percentage);

        System.out.println("Emloyee Id : " + emp.getId());
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());
    }
}

class Employee {
    private int employeeId;
    private String empname;
    private double salary;

    public void setId(int employeeId) {
        if (employeeId <= 0) {
            System.out.println("Invalid id");
        } else {
            this.employeeId = employeeId;
        }
    }

    public int getId() {
        return employeeId;
    }

    public void setName(String empname) {
        this.empname = empname;
    }

    public String getName() {
        return empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSal(double salary) {
        if (salary < 0) {
            System.out.println("Enter a valid sal");
        } else {
            this.salary = salary;
        }
    }

    public void increaseSalary(double percentage) {

        if (percentage > 0 && percentage <= 100) {
            double currentSalary = getSalary() * percentage / 100;
            double newSalary = getSalary() + currentSalary;
            this.salary = newSalary;
        } else {
            System.out.println("Invlid percentage");
        }
    }

}