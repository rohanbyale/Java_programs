import java.util.Scanner;

public class PersonDetail {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        String country = sc.next();

        Person ob = new Person();
        // Person ob = new Person(name,age,country); // use with contructor
        ob.setAge(age);
        ob.setName(name);
        ob.setCountry(country);
        ob.displayDetails();

    }
}

class Person {

    private int age;
    private String name;
    private String country;

    // public Person(int age, String name, String country) {
    // this.age = age;
    // this.name = name;
    // this.country = country;

    // }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void displayDetails() {
        System.out.println("Age: " + getAge());
        System.out.println("name: " + getName());
        System.out.println("Country: " + getCountry());

    }

}