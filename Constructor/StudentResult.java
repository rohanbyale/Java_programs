import java.util.Scanner;

class Student {

    String name;
    int marks1;
    int marks2;
    int marks3;

    // Constructor
    Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display student result
    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Name    : " + name);
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        int marks3 = sc.nextInt();

        // Create Student object
        Student student = new Student(name, marks1, marks2, marks3);

        // Display result
        student.displayResult();

     
    }
}