package String;

import java.util.Scanner;

public class ReverseEachWordinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        String result = "";
        for (int i = 0; i <= a.length - 1; i++) {

            String rev = "";

            for (int j = a[i].length() - 1; j >= 0; j--) {
                rev = rev + a[i].charAt(j);
            }
            result = result + rev + " ";

        }
        System.out.println(result.trim());
    }

}
