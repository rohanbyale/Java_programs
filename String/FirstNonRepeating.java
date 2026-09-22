package String;

import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = sc.nextLine();

        boolean isReapeating = false;
        for (int i = 0; i <= s.length() - 1; i++) {

            int count = 0;
            for (int j = 0; j <= s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println("First Non Reapeating Element is " + s.charAt(i));
                isReapeating = true;
                break;

            }
        }
        if (isReapeating == false) {
            System.out.println("All Elements are Reapeating ");
        }
    }

}
