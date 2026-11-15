
package Collection;

import java.util.*;

public class StudentMang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        StudentManagment sm = new StudentManagment();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter student id, name, marks " + i);

            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            double marks = sc.nextDouble();

            StudentData s = new StudentData(id, name, marks);
            sm.add(s);
        }

        System.out.println("Enter student ID to display the result:");
        int id = sc.nextInt();

        sm.displayStudent(id);

        sc.close();
    }
}

class StudentManagment {

    Hashtable<Integer, StudentData> t = new Hashtable<>();

    public void add(StudentData s) {
        t.put(s.id, s);
    }

    public void displayStudent(int id) {

        if (t.containsKey(id)) {
            System.out.println(t.get(id));
        } else {
            System.out.println("Student ID does not exist");
        }
    }
}

class StudentData {

    public int id;
    public String name;
    public double marks;

    public StudentData(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name
                + ", marks=" + marks + "]";
    }
}
