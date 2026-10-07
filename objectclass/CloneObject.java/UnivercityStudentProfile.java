import java.util.*;

public class UnivercityStudentProfile {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String city = sc.nextLine();
        String country = sc.nextLine();
        double gpa = sc.nextDouble();

        if (gpa < 0) {
            System.out.println("Invalid input");
            return;
        }

        Address a = new Address(city, country);

        StudentProfile sp = new StudentProfile(id, name, a, gpa);

        System.out.print("Original Student: ");
        System.out.println(sp);

        
        StudentProfile clonedStudent = sp.clone();
        clonedStudent.adress.city = "Milan";
        clonedStudent.gpa = gpa + 0.5;
        System.out.print("Cloned Student: ");
        System.out.println(clonedStudent);

    }
}

class Address implements Cloneable {
    public String city;
    public String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String toString() {
        return city + " " + country;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

class StudentProfile implements Cloneable {
    public String id;
    public String name;
    public Address adress;
    public double gpa;

    public StudentProfile(String id, String name, Address adress, double gpa) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.gpa = gpa;
    }

    public String toString() {
        return id + " " + name + " " + adress + " " + gpa;
    }

    public StudentProfile clone() throws CloneNotSupportedException {
        StudentProfile clonedStudent = (StudentProfile) super.clone();
        clonedStudent.adress = adress.clone();
        return clonedStudent;

    }

}