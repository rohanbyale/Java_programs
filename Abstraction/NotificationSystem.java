import java.util.Scanner;

/**
 * NotificationSystem
 * 
 */

public class NotificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter you message");
        String msg = sc.nextLine();

        MessageService ms = MessageFactory.getImplmentObject(choice);
        NotificationService ns = new NotificationService();
        ns.notifyUser(ms, msg);

    }

}

/**
 * system1
 * you have notificationService class which depends on Interface not on
 * implmention classes
 * where is the abstraction? what are we hiding from this
 * System-01(noticationService)
 * Answer -> System 1 knows only interface and its methods, here implementation
 * of these abstract methods are hidden from this system-01
 */
class NotificationService {
    public void notifyUser(MessageService service, String message) {
        if (service.sendMessage(message)) {
            System.out.println("Notification sent Succsessfully");
        } else {
            System.out.println("Notification Failed");
        }
    }
}

/**
 * Factory class
 * factory class is class which contains factory methods
 * what is factory method
 * it is a static method which create and returns the object of implementation
 * MessageService
 */

class MessageFactory {
    public static MessageService getImplmentObject(int choice) {
        MessageService obj = null;
        switch (choice) {
            case 1 -> {
                return new EmailService();

            }

            case 2 -> {
                return new SmsService();

            }
            case 3 -> {
                return new WhatsappService();
            }

        }
        return obj;
    }
}

interface MessageService {
    boolean sendMessage(String message);
}

class EmailService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Sends message via email");
        return true;

    }

}

class SmsService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Sends message via sms");
        return true;

    }

}

class WhatsappService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Sends message via Whatsapp");
        return true;

    }

}