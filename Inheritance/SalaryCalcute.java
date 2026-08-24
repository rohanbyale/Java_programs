

import java.util.Scanner;
class SalaryCalcute{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int id = sc.nextInt();
    double salary = sc.nextDouble();
    double bonus = sc.nextDouble();

    BonusEmployee obj = new BonusEmployee(name,id,salary,bonus);
    obj.calculateSalary();
   // System.out.println(obj.calculateSalary());
  }

}

class Employee{
  public String name;
  public int id;
  public double salary;

  public Employee(String name, int id, double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;

  }
public void displayDetails(){
  System.out.println("Name :"+name);
  System.out.println(" id "+id);
  System.out.println("salary "+ salary);
  System.out.println("Final salary"+calculateSalary());
}
  public double calculateSalary(){
    return salary;
  }

  
}

class BonusEmployee extends Employee{
  public double  bonus;
  public BonusEmployee(String name, int id, double salary, double bonus){
    super(name, id,salary);
    this.bonus = bonus;
  }


public double calculateSalary(){
  System.out.println("basic salary: "+ super.calculateSalary());
  System.out.println("Bonus"+bonus);
  return super.calculateSalary()+bonus;
}
}