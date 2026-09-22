package String;

import java.util.Scanner;

/**
 * FindDuplicatechar
 */
public class FindDuplicatechar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();


     String result = "";
     for(int i = 0; i<=a.length()-1; i++){
        char ch = a.charAt(i);

        if(!result.contains(""+ch)){
            result += ch;
        } else{
            System.out.println(ch+" ");
        }
     }

        
    }
}