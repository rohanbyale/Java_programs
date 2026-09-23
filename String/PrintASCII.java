package String;

import java.util.Scanner;

public class PrintASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String s = sc.nextLine();

        System.out.println("ASCII values of Given String is ");

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }
}
