// public class Constructor {
//     public static void main(String[] args) {
//         Student obj = new Student("rohan", 12, "smbvo", "Hyderbad");

//         obj.displayDetails();

//     }
// }

// class Student {

//     public String name;
//     public int age;
//     public String school;
//     public String city;

//     public Student(String name, int age, String school, String city) {
//         this.name = name;
//         this.age = age;
//         this.school = school;
//         this.city = city;

//     }

//     public void displayDetails() {
//         System.out.println("name " + name);
//         System.out.println("age " + age);
//         System.out.println("school " + school);
//         System.out.println("city " + city);
//     }

// }
//-----------------------------------------------------------------------------------------------------------------------------

// import java.util.Scanner;
// class Constructor {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter details");

//     String bookName = sc.next();
//     String authorName = sc.next();
//     double age = sc.nextInt();

//     Book b1 = new Book(bookName,authorName,age);
//     b1.displayDetails();
//     b1.issueBook();

// }

// }

// class Book {
//     public String bookName;
//     public String authorName;
//     public double price;

//     public Book(String bookName, String authorName, double price) {
//         this.bookName = bookName;
//         this.authorName = authorName;
//         this.price = price;
//     }

//     public void displayDetails() {
//         System.out.println("BookName = " + bookName);
//         System.out.println("authorName = " + authorName);
//         System.out.println("price " + price);

//     }

//     public void issueBook(){
//         System.out.println("Book issues Succesfully"+ bookName);
//     }

// }  

//-------------------------------------------------------------

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolderName = sc.nextLine();
        int accountNumber = sc.nextInt();
        double balance = sc.nextInt();

       BankAccount obj = new  BankAccount(accountHolderName,accountNumber,balance);
       obj.deposit(500);
       obj.withdraw(1000);
       
        obj.displayDetails();

    }

}

class BankAccount {
    // step 01 --- define static and not satic variables
    public String accountHolderName;
    public int accontNumber;
    public double balance;

    // step 02 ---- define constructor
    public BankAccount(String accountHolderName , int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accontNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Holder name = " + accountHolderName);
        System.out.println("Account Number = " + accontNumber);
        System.out.println("Bank Balane =  " + balance);
    }

    // step 03 --- write any method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit of " + amount + " is done sucessfully......!");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficeint balance......!");
        } else {
            balance = balance - amount;
            System.out.println("Amount of " + amount + "is deducted");
        }
    }

    public void DisplayBalance() {
        System.out.println("Your balance is " + balance);
    }

}
