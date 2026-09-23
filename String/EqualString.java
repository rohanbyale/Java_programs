package String;

import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        System.out.println("Enter a String");
        String s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not  Equal");
        }
    }
}
