package String;

import java.util.Scanner;

public class LargestWordintSentenc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        String a[] = s.split(" ");
        int maxlength = 0;
        for (String e : a) {
            if (e.length() >  maxlength) {
                maxlength = e.length();

            }
        }

        for (String e : a) {
            if (e.length() == maxlength) {
                System.out.println(e);
            }
        }
    }
}
