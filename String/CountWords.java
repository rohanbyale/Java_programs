package String;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        /* Step 1)-----------------------> */
        // int count = 0;

        // for (int i = 0; i <= s.length() - 1; i++) {

        // if (s.charAt(i) == ' ') {
        // count++;
        // }
        // }
        // System.out.println("Number of Words In Given String " + (count + 1));

        /* Step 2)------------------------> */

        String[] arr = s.split(" ");
        System.out.println("Count of Words in Given String is : " + arr.length);

    }
}
