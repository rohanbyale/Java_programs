package String;

import java.util.Scanner;

public class FrequencofCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String rev = "";
        for (int i = 0; i <= a.length() - 1; i++) {

            if (!(rev.contains("" + a.charAt(i)))) {
                int count = 0;
                for (int j = 0; j <= a.length() - 1; j++) {
                    if (a.charAt(i) == a.charAt(j)) {
                        count++;
                    }

                }
                System.out.println(a.charAt(i) + "=" + count);
                rev = rev + a.charAt(i);
            }

        }

    }
}
