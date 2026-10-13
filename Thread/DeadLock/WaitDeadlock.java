
public class WaitDeadlock {
    public static void main(String[] args) throws InterruptedException {

        Mythread01 ob = new Mythread01();

        ob.start();
        Thread.sleep(5000);

        synchronized (ob) {
            System.out.println("Main thread waiting...");
            ob.wait();
        }

        for(int i = 0; i<=10; i++){
          System.out.println(i);
        }
    }
}

class Mythread01 extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }

            notify();
        }
    }
}
