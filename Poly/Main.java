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