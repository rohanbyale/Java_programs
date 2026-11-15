package Thread;

/**
 * SMethod
 */
public class Sync {

	public static void main(String[] args) throws InterruptedException {
		Employee emp = new Employee();
		Threadx t1 = new Threadx(emp);
		Thready t2 = new Thready(emp);
		t1.start();
		t2.start();
	}
}

class Employee {

	public synchronized void demo() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public void Fast() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
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
		emp.Fast();
	}
}
