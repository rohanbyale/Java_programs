package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char a[] = s1.toCharArray();

        Arrays.sort(a);
        s1 = String.valueOf(a);
        System.out.println("Sorted String is  : " + s1);
    }
}
