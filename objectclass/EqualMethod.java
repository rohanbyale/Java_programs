package objectclass;

/**
 * EqualMethod
 */
import java.util.*;

class EqualMethod {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int studentid = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String course = sc.nextLine();

        int studentid1 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        String course2 = sc.nextLine();

        if (studentid < 0) {
            System.out.println("Error: Student ID must be greater than zero");
            return;
        }

        Student ob = new Student(studentid, name, course);
        Student ob2 = new Student(studentid1, name2, course2);

        if (ob.equals(ob2)) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }

    }
}

class Student {
    public int studentid;
    public String name;
    public String course;

    public Student(int studentid, String name, String course) {
        this.studentid = studentid;
        this.name = name;
        this.course = course;
    }

    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.studentid == other.studentid;
    }
}
