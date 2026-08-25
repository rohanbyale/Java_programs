import java.util.Scanner;

public class classManagment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student inputs
        String studentname = sc.next();
        int studentid = sc.nextInt();
        sc.nextLine();
        String studentdepartment = sc.nextLine();
        int marks = sc.nextInt();

        // Teacher inputs
        String teachername = sc.next();
        int teacherid = sc.nextInt();
        sc.nextLine();
        String teacherdepartment = sc.nextLine();
        double salary = sc.nextDouble();

        // Admin inputs
        String adminname = sc.next();
        int adminid = sc.nextInt();
        sc.nextLine();
        String admindepartment = sc.nextLine();
        String role = sc.nextLine();

        // Librarian inputs
        String librarianname = sc.next();
        int librarianid = sc.nextInt();
        sc.nextLine();
        String librariandepartment = sc.nextLine();
        int booksHandled = sc.nextInt();

        // create object
        // ----------------------Student object------------//
        Student obj = new Student(studentname, studentid, studentdepartment, marks);
        obj.displayDetails();
        obj.login();
        obj.write();
        obj.logout();
        System.out.println();

        // ----------------------Teacher object------------//
        Teacher obj1 = new Teacher(teachername, teacherid, teacherdepartment, salary);
        obj1.displayDetails();
        obj1.login();
        obj1.teachClass();
        obj1.logout();
        System.out.println();

        // ----------------------Admin object------------//
        Admin obj2 = new Admin(adminname, adminid, admindepartment, role);
        obj2.displayDetails();
        obj2.login();
        obj2.manageSystem();
        obj2.logout();
        System.out.println();

        // ----------------------Librarian object------------//
        Librarian obj3 = new Librarian(librarianname, librarianid, librariandepartment, booksHandled);
        obj3.displayDetails();
        obj3.login();
        obj3.issueBook();
        obj3.logout();
        System.out.println();

    }
}

class User {
    public String name;
    public int id;
    public String department;

    public User(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;

    }

    public void login() {
        System.out.println("User logged in");
    }

    public void logout() {
        System.out.println("User logged out");
    }

}

class Student extends User {
    public int marks;

    public Student(String name, int id, String department, int marks) {
        super(name, id, department);
        this.marks = marks;

    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public void write() {
        System.out.println("Student is writing exam");
    }

}

// Teacher class

class Teacher extends User {
    public double salary;

    public Teacher(String name, int id, String department, double salary) {
        super(name, id, department);
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public void teachClass() {
        System.out.println("Teacher is teaching class");
    }
}

// Admin class

class Admin extends User {
    public String role;

    public Admin(String name, int id, String department, String role) {
        super(name, id, department);
        this.role = role;

    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public void manageSystem() {
        System.out.println("Admin is managing system");
    }

}

// librarian class

class Librarian extends User {
    public int booksHandled;

    public Librarian(String name, int id, String department, int booksHandled) {
        super(name, id, department);
        this.booksHandled = booksHandled;

    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public void issueBook() {
        System.out.println("Librarian is issuing books");
    }

}