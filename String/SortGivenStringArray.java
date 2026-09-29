package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortGivenStringArray {
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String s[] = new String[size];

        for (int i = 0; i <= s.length - 1; i++) {
            s[i] = sc.nextLine();
        }

        for (int cycle = 1; cycle <= s.length - 1; cycle++) {
            for (int i = 0; i <= s.length - 2; i++) {
                if (s[i].compareTo(s[i + 1]) > 0) {
                    String temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(s));
 }   
}
