package String;

import java.util.Scanner;

public class PrintFirstChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = sc.nextLine();

        String a[] = s.split(" ");

        System.out.println("First Character of Each of words : ");
        for (String e : a) {
            System.out.println(e.substring(0, 1));
        }
    }
}
