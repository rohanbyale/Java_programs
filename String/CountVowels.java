package String;

import java.util.Scanner;

/**
 * CountVowels
 */
public class CountVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vcount++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Vowels count: " + vcount);
        System.out.println("Consonant count: " + ccount);
    }
}