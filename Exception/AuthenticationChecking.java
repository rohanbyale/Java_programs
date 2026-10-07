import java.util.*;

class Main {
    public static void AuthenticationChecker(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter the password");
        String password = sc.nextLine();

        Employee emp = new Employee(id, name, password);

        try {
            emp.registerEmployee(password);

        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String errorMessage) {
        super(errorMessage);

    }
}

class Employee {
    private int id;
    private String name;
    private String password;

    public Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void registerEmployee(String password) throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must contain at least 8 characters");
        } else if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at leat uppercase letters");
        } else if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("Password must contain at least one digit");
        } else {
            System.out.println("Login Successfull");
        }

    }
}