package String;

import java.util.Scanner;

public class CheckStringContainsDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        String s = sc.nextLine();

        boolean onlyDigits = true;

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                onlyDigits = false;
                break;

            }}
            if (onlyDigits) {
                System.out.println("String has only digits");
            } else {
                System.out.println("String dont have only digits");
            }
        

    }

}
