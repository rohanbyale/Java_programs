import java.util.Scanner;

public class ResultS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rollNo = sc.nextInt();
        int marks = sc.nextInt();
        Result ob = new Result(name, rollNo, marks);
        ob.displayDetails();
    }
}

class StudentDetail {
    public String name;
    public int rollNo;
    public int marks;

    public StudentDetail(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class Result extends StudentDetail {

    public Result(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    public void calculateResult() {
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        calculateResult();
    }

}
