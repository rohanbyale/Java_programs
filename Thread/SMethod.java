
/**
 * SMethod
 */
// public class SMethod {

//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         Threadx t1 = new Threadx(emp);
//         Thready t2 = new Thready(emp);
//         t1.start();
//         t2.start();
//     }
// }

// class Employee {

//     public synchronized void demo() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + i);
//         }
//     }

//     public void Fast() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + i);
//         }
//     }
// }

// class Threadx extends Thread {
//     Employee emp;

//     public Threadx(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.demo();
//     }
// }

// class Thready extends Thread {
//     Employee emp;

//     public Thready(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.Fast();
//     }
// }

/** Object Level Lock both method will work concrently
 * non static synchronized methods will give you object level locks 
 */

// public class SMethod {

//     public static void main(String[] args) {
//         Employee emp1 = new Employee();
//         Employee emp2 = new Employee();

//         Threadx t1 = new Threadx(emp1);
//         Thready t2 = new Thready(emp2);
//         t1.start();
//         t2.start();
//     }
// }

// class Employee {

//     public synchronized void demo() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + i);
//         }
//     }

//     public void Fast() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + i);
//         }
//     }
// }

// class Threadx extends Thread {
//     Employee emp;

//     public Threadx(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.demo();
//     }
// }

// class Thready extends Thread {
//     Employee emp;

//     public Thready(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.demo();
//     }
// }

/**
 * static synchronized methods will get class level locks
 */

// public class SMethod {

//     public static void main(String[] args) {
//         Employee emp1 = new Employee();
//         Employee emp2 = new Employee();

//         Threadx t1 = new Threadx(emp1);
//         Thready t2 = new Thready(emp2);
//         t1.start();
//         t2.start();
//     }
// }

// class Employee {

//     public static synchronized void demo() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + i);
//         }
//     }
// }

// class Threadx extends Thread {
//     Employee emp;

//     public Threadx(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.demo();
//     }
// }

// class Thready extends Thread {
//     Employee emp;

//     public Thready(Employee emp) {
//         this.emp = emp;
//     }

//     public void run() {
//         emp.demo();
//     }
// }

/**
 * Particular Synchronizes block class level lock
 */


public class SMethod {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        Threadx t1 = new Threadx(emp1);
        Thready t2 = new Thready(emp2);
        t1.start();
        t2.start();
    }
}

class Employee {

    public  void demo() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

        synchronized(Employee.class){
             for (int i = 5; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        }
    }
}

class Threadx extends Thread {
    Employee emp;

    public Threadx(Employee emp) {
        this.emp = emp;
    }

    public void run() {
        emp.demo();
    }
}

class Thready extends Thread {
    Employee emp;

    public Thready(Employee emp) {
        this.emp = emp;
    }

    public void run() {
        emp.demo();
    }
}