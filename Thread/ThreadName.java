import java.util.*;

public class ThreadName {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Mythread a = new Mythread();
        Mythread2 b = new Mythread2();
        System.out.println(a.getName());
        System.out.println(b.getName());

        b.setName("Rohan");
        System.out.println(b.getName());

    }
}

class Mythread extends Thread {
    public void run() {
        System.out.println("Hello how are you");
    }
}

class Mythread2 extends Thread {
    public void run() {
        System.out.println("Hello ");
    }
}