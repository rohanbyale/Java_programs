import java.util.*;

public class PasswordValidator {
    public static void main(String[] args) throws Exception {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            validatePassword(s);
            System.out.println("Authentication successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validatePassword(String s) throws Exception {

        if (s.length() < 8) {
            throw new Exception("Password must be at least 8 characters");
        }

        boolean uppercase = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase = true;
            }

            if (Character.isDigit(ch)) {
                digit = true;
            }

            if (!Character.isLetterOrDigit(ch)) {
                special = true;
            }
        }

        if (!uppercase) {
            throw new Exception("Password must contain at least one uppercase");
        }
        if (!digit) {
            throw new Exception("Password must contain at least one digit");
        }

        if (!special) {
            throw new Exception("Password must contain at least one speacial character");
        }
    }
}
