class BankDetails {
    public static void main(String[] args) {
        Bank b = new Bank();
        Customer1 c1 = new Customer1(b);
        Customer2 c2 = new Customer2(b);
        c1.setName("Rohan");
        c2.setName("Gajanan");
        c1.start();
        c2.start();
    }
}

class Bank {
    public int balance = 1000;

    public synchronized void Deposit(int amount) {

        balance += amount;
        System.out.println(" Balance after Deposit " + Thread.currentThread().getName() + " Amount :---> " + balance);
    }
}

class Customer1 extends Thread {
    public Bank b;

    public Customer1(Bank b) {
        this.b = b;
    }

    public void run() {
        b.Deposit(500);
    }
}

class Customer2 extends Thread {
    public Bank b;

    public Customer2(Bank b) {
        this.b = b;
    }

    public void run() {
        b.Deposit(700);
    }
}