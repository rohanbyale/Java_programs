package String;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String String ");
        String s1 = sc.nextLine();

        System.out.println("Enter a second String: ");
        String s2 = sc.nextLine();

        System.out.println(s1.concat(s2));
    }
}
