import java.util.*;

public class ThreadPriority {
    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();

        // Default Priority Before set priority
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();

        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println("Main Thread got Executed");

    }

}

class Mythread extends Thread {
    public void run() {
        for (int i = 1001; i <= 2001; i++) {
            System.out.println(i);
        }
        System.out.println("Thread t1 got Executed:---------------");
    }
}

class Mythread2 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);

        }
        System.out.println("Thread t2 got Executed------------->");
    }
}