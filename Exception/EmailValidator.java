import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email = sc.nextLine();

        Customer obj = new Customer(name, email);

        try {
            obj.registerCustomer();
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String errorMessage) {
        super(errorMessage);
    }
}

class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void registerCustomer() throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain a @ symbol");
        }
        int count = 0;
        for (int i = 0; i <= email.length() - 1; i++) {
            char ch = email.charAt(i);

            if (ch == ('@')) {
                count++;

            }
            if (count == 2) {
                throw new InvalidEmailException("Email must not contain one @ symbol");
            }

            if (email.charAt(0) == '@' || email.charAt(email.length() - 1) == '@') {
                throw new InvalidEmailException("Invalid email format");
            }

        }

        if (email.indexOf('.') < email.indexOf('@')) {
            throw new InvalidEmailException("Email must contain a dot after @");
        }

        if (email.contains("@,") || email.contains("@.")) {
            throw new InvalidEmailException("Invalid email format");
        }
        System.out.println("Customer registeres successfully ");

    }
}