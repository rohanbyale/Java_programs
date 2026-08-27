import java.util.Scanner;

public class StudentPortal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id, name, marks and new Marks");
        int studentId = sc.nextInt();
        String studentName = sc.next();
        int marks = sc.nextInt();
        int newMarks = sc.nextInt();

        ExamPortal ob = new ExamPortal(studentId, studentName, marks);
        ob.displayResult();
        ob.setMarks(newMarks);

    }
}

class StudentAccount {
    private int studentId;
    private String studentName;
    private int marks;

    public StudentAccount(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;

    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int newMarks) {
        if (newMarks < 0 || newMarks > 100) {
            System.out.println("Invalaid marks");
        } else {
            System.out.println("Marks are updated");
            this.marks = newMarks;

        }
    }

    public void displayResult() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}

class ExamPortal extends StudentAccount {
    public ExamPortal(int studentId, String studentName, int marks) {
        super(studentId, studentName, marks);
    }

    public void setMarks(int newMarks) {
        if (newMarks > 100) {
            System.out.println("Limit exceeded");
        } else {
            super.setMarks(newMarks);

        }
    }
}