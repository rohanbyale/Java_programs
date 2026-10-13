
class BoookTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Customer c1 = new Customer("Rohan", 2, t);
        Customer c2 = new Customer("Akshay", 2, t);
        Customer c3 = new Customer("John", 2, t);

        c1.start();
        c2.start();
        c3.start();
    }
}

class Ticket {
    public int availableTickets = 5;

    public synchronized void BookTicket(int numberTicket, String name) {
        if (numberTicket <= availableTickets) {
            availableTickets -= numberTicket;

            System.out.println(numberTicket +
                    " Tickets Booked for " + name);
            System.out.println("Available Tickets: " + availableTickets);
        } else {
            System.out.println("Ticket Limit Exceeds for " + name);
            System.out.println("Available Tickets: " + availableTickets);
        }
    }
}

class Customer extends Thread {
    String name;
    int numberTicket;
    Ticket t;

    public Customer(String name, int numberTicket, Ticket t) {
        this.name = name;
        this.numberTicket = numberTicket;
        this.t = t;
    }

    public void run() {
        t.BookTicket(numberTicket, name);
    }
}