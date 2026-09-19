package String;

import java.util.Scanner;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for(int i = 0; i<=s.length()-1; i++){
            if(s.charAt(i) != ' '){
       result+=s.charAt(i);
            }
        }
        System.out.println(result);

    }
}
