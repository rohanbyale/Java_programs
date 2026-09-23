package String;

import java.util.Scanner;

public class ToggleCasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        // String result = "";

        // String a [] = s.split(" ");

        // for(String e : a){
        // System.out.print(e.substring(0,1).toLowerCase()+e.substring(1).toUpperCase()+"
        // ");
        // }

        String result = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);

            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;

        }

        System.out.println(result);

    }

}
