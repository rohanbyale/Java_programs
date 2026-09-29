import java.util.Scanner;

public class Employee {
    static Emp a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        a = new Emp[size];

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter id,name,dept,salary");
            int empid = sc.nextInt();
            String name = sc.nextLine();
            String dept = sc.nextLine();
            double salary = Double.parseDouble(sc.next());

            a[i] = new Emp(empid, name, dept, salary);

        }

        System.out.println("Enter choice to 1) diplay by name 2) display by id 3) display by dept");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                String dept = sc.nextLine();
                employeebyDepartment(dept);

            }
            case 2 -> {
                String name = sc.nextLine();
                employeebyName(name);

            }
        }

    }

    public static void employeebyDepartment(String dept) {
        for (Emp e : a) {
            if (dept.equalsIgnoreCase(e.dept)) {
                e.displayDetails();
            }
        }
    }

    public static void employeebyName(String name) {
        for (Emp e : a) {
            if (name.equalsIgnoreCase(e.name)) {
                e.displayDetails();
            }
        }
    }
}

class Emp {
    public int empid;
    public String name;
    public String dept;
    public double salary;

    public Emp(int empid, String name, String dept, double salary) {
        this.empid = empid;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Id " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Departname " + dept);
        System.out.println("Employee Salary : " + salary);
    }
}
