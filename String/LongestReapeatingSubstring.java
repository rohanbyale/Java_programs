package String;

import java.util.Scanner;

public class LongestReapeatingSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String rev = "";
        for (int i = 0; i <= a.length() - 1; i++) {
            int count = 0;

            if (!(rev.contains("" + a.charAt(i)))) {
                count++;
                rev = rev + a.charAt(i);
            }

        }
        System.out.println(rev);
        System.out.println(rev.length());

    }
}
