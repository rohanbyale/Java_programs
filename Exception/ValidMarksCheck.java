import java.util.*;

public class ValidMarksCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        int marks[] = new int[5];
        System.out.println("Enter the array element one by one");
        for (int i = 0; i <= marks.length - 1; i++) {
            marks[i] = sc.nextInt();

        }

        Student ob = new Student(name, marks);

        try {
            ob.checkMarks(marks);

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

    }
}

class InvalidMarksException extends Exception {

    public InvalidMarksException(String erroMessage) {
        super(erroMessage);
    }
}

class Student {

    private String name;
    private int marks[];

    public Student(String name, int marks[]) {
        this.name = name;
        this.marks = marks;

    }

    public void checkMarks(int marks[]) throws InvalidMarksException {
        int sum = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            if (marks[i] < 0) {
                throw new InvalidMarksException("Invlaid marks less than 0");
            } else if (marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks above 100 found");
            }

            sum = sum + marks[i];
        }

        System.out.println("All marks are Valid");
        int avg = sum / 5;
        System.out.println("Avg of marks: " + avg);
    }

}