public class Demo {
    public static void main(String[] args) {
        System.out.println("Bye");
        A ob = new A();
        A ob2 = new A();
        A ob23 = new A();
    }

    static {
        System.out.println("Hello");
    }
}

class A {
    public A() {
        System.out.println("Good");
    }

    static {
        System.out.println("Hii");
    }
}