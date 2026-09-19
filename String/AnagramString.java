package String;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "RACE";
        String s2 = "CARE";
       

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Given Array is Anagram");
        } else {
            System.out.println("Not an anagram");
        }

    }
}
