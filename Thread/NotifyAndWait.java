public class NotifyAndWait {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        try {
            synchronized (t) {
                t.start();
                t.wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

    }

}

class MyThread extends Thread {

    public void run() {

        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
            if (i == 150) {
                synchronized (this) {
                    notify();
                }
            }
        }

    }
}

// wait method with arguments 