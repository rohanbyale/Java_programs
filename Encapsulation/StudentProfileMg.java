import java.util.Scanner;

class StudentProfileMg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No : ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Name : ");
        String name = sc.next();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Student Marks : ");
        double marks = sc.nextDouble();
        Student ob = new Student();
        ob.setRollNo(rollNo);
        ob.setName(name);
        ob.setAge(age);
        ob.setMarks(marks);

        System.out.println("Roll No : " + ob.getRollNo());
        System.out.println("Name : " + ob.getName());
        System.out.println("Age : " + ob.getAge());
        System.out.println("Marks : " + ob.getMarks());

    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private double marks;

    public void setRollNo(int rollNo) {
        if (rollNo < 0) {
            System.out.println("Enter a valid roll No");
        }
        this.rollNo = rollNo;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 15 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Enter a valid Age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Enter a vaid Marks");
        }

    }

    public double getMarks() {
        return marks;
    }

}