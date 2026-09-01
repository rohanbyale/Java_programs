// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {
// //       System.out.println("Hello, World!");
// //       System.out.println("Enter")
// //       Scanner sc = new Scanner(System.in);
// //       double monthlySalary = sc.nextDouble();
// //       int hours = sc.nextInt();
// //       double ratePerhour = sc.nextDouble();
// //       double fixedAmount = sc.nextDouble();
// //       double bonus = sc.nextDouble();

// //       SalaryCalculator ob = new SalaryCalculator();

// //     System.out.println("Full Time: "+ob.calculateSalary(monthlySalary));
// //     System.out.println("Part Time: "+ob.calculateSalary(hours,ratePerhour));
// //     System.out.println("Contract Tim: "+ob.calculateSalary(fixedAmount,bonus));
// //     }
// // }

// // class SalaryCalculator{

// // public double calculateSalary(double monthlySalary){
// //  double  salary = monthlySalary;
// // return salary;
// // }

// // public double calculateSalary(int hours, double ratePerhour ){
// // double salary = hours * ratePerhour;
// // return salary;
// // }

// // public double calculateSalary(double fixedAmount, double bonus){
// //   double salary = fixedAmount + bonus;
// //  return salary;
// // }

// // }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//       Scanner sc = new Scanner(System.in);
//      Engine eng = new Engine("Petrol", 1.5);
//      Car c = new Car("Honda","Black",150, eng);

//      c.displayDetails();
//     }
// }

// class Car{
//   String Name;
//   String color;

//   int topSpeed;
//   Engine engine;

//   public Car(String Name, String color, int topSpeed, Engine engine){
//     this.Name = Name;
//     this.color = color;
//     this.topSpeed = topSpeed;
//     this.engine = engine;
//   }

//   public void displayDetails(){
//     System.out.println("Compnay Name: "+Name);
//     System.out.println("Color: "+color);
//     System.out.println("Top Speed: "+topSpeed);
//  engine.displayDetails();

//   }

// }

// class  Engine{
//   String fuelTeype;
//   double cc;

//   public Engine(String fuelTeype, double cc){
//     this.fuelTeype = fuelTeype;
//     this.cc = cc;
//   }

//   public void displayDetails(){
//     System.out.println("Fuel Type: "+fuelTeype);
//     System.out.println("CC: "+cc);
//   }

// }

// // asociation
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//       Scanner sc = new Scanner(System.in);
//      Pen p = new Pen("Tramax","Black","Ball Pen",12);
//      Student s = new Student("Rohan", 19,"Computer Science",p);
//      s.displayDetails();
//     }
// }

// class Student{
//   String name;
//   int age;
//   String course;
//   Pen pen;

//   public Student(String Name, int age, String course,Pen pen ){
//     this.name = name;
//     this.age = age;
//     this.course = course;
//     this.pen = pen;

//   }

//   public void displayDetails(){
//     System.out.println("Name: "+name);
//     System.out.println("Age: "+age);
//     System.out.println("Course: "+course);
//     pen.displayDetails();
//   }

// } 

// class Pen{

//   String brand;
//   String colour;
//   String type;
//   double price;

//   public Pen(String brand, String colour, String type, double price){
//     this.brand = brand ;
//     this.colour = colour;
//     this.type = type;
//     this.price = price;

//   }

//   public void displayDetails(){
//     System.out.println("Brand: "+brand);
//     System.out.println("colour: "+colour);
//     System.out.println("Pen Type: "+type);
//     System.out.println("Price : "+price);
//   }
// }

/**
 * Main
 */

// // agreegation
// public class Main {

// public static void main(String[] args) {

// Customer c1 = new Customer("Rohan", "Savin", 12000);
// Customer c2 = new Customer("Vyas ", "Current", 199999);
// Customer c3 = new Customer("Mangesh ", "Fixed", 10000);

// Bank b = new Bank("Sbi Bank", "Ammerpet", c1, c2, c3);
// b.displayDetails();

// }
// }

// class Bank {
// String name;
// String place;
// Customer c1;
// Customer c2;
// Customer c3;

// public Bank(String name, String place, Customer c1, Customer c2, Customer c3)
// {
// this.name = name;
// this.place = place;
// this.c1 = c1;
// this.c2 = c2;
// this.c3 = c3;

// }

// public void displayDetails() {
// System.out.println("Name of the Bank" + name);
// System.out.println("Location of the Bank" + place);
// System.out.println("-------------------------------------------------");
// c1.displayDetails();
// System.out.println("---------------------------------------------------");
// c2.displayDetails();
// System.out.println("--------------------------------------------------");
// c3.displayDetails();
// }
// }

// class Customer {
// String name;
// String accType;
// double balance;

// public Customer(String name, String accType, double balance) {
// this.name = name;
// this.accType = accType;
// this.balance = balance;
// }

// public void displayDetails() {
// System.out.println("Name of the Customer : " + name);
// System.out.println("Account Type : " + accType);
// System.out.println("Account Balance : " + balance);
// }
// }

/// program
// template method provides a proper method for method calls
// template method should be final
// why? so that subclasses wont override.
//

// class Main {
// public static void main(String[] args) {
// Drink d1 = new Tea();
// d1.makeDrink();
// Drink d2 = new Coffe();
// d2.makeDrink();

// }
// }

// abstract class Drink {

// final void makeDrink() // it is a template method
// {

// // first method

// boilWater();
// addMainItem();
// pourIntoCup();
// addExtra();

// }

// public abstract void boilWater();

// public abstract void addMainItem();

// public abstract void pourIntoCup();

// public abstract void addExtra();

// }

// class Tea extends Drink {
// public void boilWater() {
// System.out.println("Start boiling the water");

// }

// public void addMainItem() {
// System.out.println("Add tea powder");
// }

// public void pourIntoCup() {
// System.out.println("Drink is pored into the cup");
// }

// public void addExtra() {
// System.out.println("Add suger");
// }

// }

// class Coffe extends Drink {
// public void boilWater() {
// System.out.println("Start boiling the water");

// }

// public void addMainItem() {
// System.out.println("Add coffe (nescafe) powder");
// }

// public void pourIntoCup() {
// System.out.println("Drink is pored into the cup");
// }

// public void addExtra() {
// System.out.println("Add suger and anythign you want ");
// }
// }
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Atm ob1 = new Withdraw();
    ob1.Process();

  }
}

abstract class Atm {

  // template method

  final public void Process() {
    insertCard();
    enterPin();
    doTransacton();
    printReceipt();
  }

  public void insertCard() {
    System.out.println("Card is inserted");
  }

  public void enterPin() {
    System.out.println("Pin entered successfulluy");
  }

  public abstract void doTransacton();

  public void printReceipt() {
    System.out.println("Receipt is printed");
  }

}

class Withdraw extends Atm {

  public void doTransacton() {
    System.out.println("Amount is withdrawn Succesfully");

  }

}

class Deposit extends Atm {
  public void doTransacton() {
    System.out.println("Amoutn is deopsited successfully");
  }
}

class checkBalance extends Atm {
  public void doTransacton() {
    System.out.println("Checked the available balance successfully");
  }
}
