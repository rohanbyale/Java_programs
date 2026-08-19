package objects;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.age = 12;
        // s1.city = "Hyderbad";
        // s1.school = "ABC";
        s1.displayDetails();

        Student s2 = new Student();
        s2.name = "Mohan";
        s2.age = 13;
        // s2.city = "Hyderbad";
        // s2.school = "ABC";
        s2.displayDetails();

    }
}

class Student {
    public String name;
    public int age;
    public static String city="Hyderbad";
    public static String school = "ABC";

    public void displayDetails() {
        System.out.println("Name = " + name);
        System.out.println("age = " + age);
        System.out.println("city = " + city);
        System.out.println("school = " + school);
    }
}
