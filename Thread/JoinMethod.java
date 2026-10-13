import java.util.*;

/**
 * Both thread are waiting for each other DeadLock
 * JoinMethod
 */
public class JoinMethod {
  public static void main(String[] args) throws Exception {

    Myrunable r1 = new Myrunable(Thread.currentThread());
    Thread t1 = new Thread(r1);
    t1.start();

    System.out.println("Main thread waits for t1");
    t1.join();
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);

    }
    System.out.println("Main got terminated");
  }
}

class Myrunable implements Runnable {
  Thread mt;

  public Myrunable(Thread mt) {
    this.mt = mt;
  }

  public void run() {
    System.out.println("T1 wait for main ");
    try {
      mt.join();

      for (int i = 101; i <= 200; i++) {
        System.out.println(i);
      }
      System.out.println("t1 got executed");

    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }

}

// public class JoinMethod {
// public static void main(String[] args) {

// MyThread t = new MyThread(Thread.currentThread());
// t.start();

// for (int i = 1; i <= 100; i++) {
// System.out.println(i);
// }
// System.out.println("Main Thread Got Executed");

// }

// }

// class MyThread extends Thread {
// Thread mt;
// public MyThread(Thread mt){
// this.mt = mt;
// }
// public void run() {

// System.out.println("T1 thread wait for main thread");
// try{
// mt.join();
// for (int i = 101; i <= 200; i++) {
// System.out.println(i);
// }
// }catch(InterruptedException e){
// System.out.println(e.getMessage());
// }
// }
// }
