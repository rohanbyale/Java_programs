import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StudentDetails ob = new StudentDetails(name);
        ob.displayName();
        
    }
}

class Student{
    public String name;

    public Student(String name){
        this.name = name;
    }
}

class StudentDetails extends Student{
     public String name;

     public StudentDetails(String name){
        super(name);
     }

     public void displayName(){
    System.out.println("Parent Name: "+super.name);
     }

}

/*


An educational institute is developing a Java application to manage student details.
The parent class stores a student’s name.

Later, a child class also declares a variable with the same name, unintentionally hiding the parent’s variable.
To correctly access and display the parent class name, the developer must use the super keyword.

This scenario demonstrates the concept of variable hiding and how super.variable helps access the parent data.

Class Design
Superclass: Student

Purpose:
Stores the original student name.

Variable:

String name – student name stored in parent class

Constructor:

Initializes the parent name

Subclass: StudentDetails

Purpose:
Has a variable with the same name and accesses the parent variable using super.

Variable:

String name – hides parent variable

Method:

void displayParentName()
Prints the parent class name using super.name

Input Format

A single string representing student name

Output Format
Parent Name: <name>
Examples
Example 1:

Input

John
Output

Parent Name: John
Example 2:

Input

Ravi
Output

Parent Name: Ravi
Explanation

Both parent and child classes have a variable named name

Child variable hides the parent variable

super.name explicitly refers to the parent’s variable

Demonstrates variable hiding resolution
*/