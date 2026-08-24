
package SingleLevel;
import java.util.Scanner;

public class AnimalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dog Name");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Dog Breed: ");
        String breed = sc.nextLine();

        Dog obj = new Dog(name, age, breed);
        obj.displayDetails();
        obj.eat();
        obj.bark();
    }
}

class Animal {

    public String name;
    public int age;

    public Animal(String name, int age){
        this.name= name;
        this.age = age;

    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }

    public void eat(){
        System.out.println("Eating Food ");
    }
}

class Dog extends Animal {
    public String breed;

    public Dog(String name, int age, String breed){
     super(name, age);
     this.breed = breed;
    }

    public void displayDetails(){
        super.displayDetails();

    }
    public void bark(){
        System.out.println("Dog is Barking");
    }

}