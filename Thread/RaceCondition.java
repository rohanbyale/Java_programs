
class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        House h = new House();
        Mythread t = new Mythread(h);
        Mythread2 t1 = new Mythread2(h);

        t.start();
        t1.start();
        t.join();
        t1.join();

        System.out.println(h.count);

    }
}

class House {
    int count = 0;

    public synchronized void Increase() { // 
        count++;
    }

}

class Mythread extends Thread {
    House h;

    public Mythread(House h) {
        this.h = h;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            h.Increase();
        }
    }
}

class Mythread2 extends Thread {
    House h;

    public Mythread2(House h) {
        this.h = h;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            h.Increase();
        }
    }
}


// import java.util.concurrent.atomic.AtomicInteger;

// class Main {
//     public static void main(String[] args) throws InterruptedException {
//         House h = new House();

//         Mythread t = new Mythread(h);
//         Mythread2 t1 = new Mythread2(h);

//         t.start();
//         t1.start();

//         t.join();
//         t1.join();

//         System.out.println(h.count.get());
//     }
// }

// class House {
//     AtomicInteger count = new AtomicInteger();
// }

// class Mythread extends Thread {
//     House h;

//     public Mythread(House h) {
//         this.h = h;
//     }

//     public void run() {
//         for (int i = 1; i <= 10000; i++) {
//             h.count.incrementAndGet();
//         }
//     }
// }

// class Mythread2 extends Thread {
//     House h;

//     public Mythread2(House h) {
//         this.h = h;
//     }

//     public void run() {
//         for (int i = 1; i <= 10000; i++) {
//             h.count.incrementAndGet();
//         }
//     }
// }
