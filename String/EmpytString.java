package String;

import java.util.Scanner;

public class EmpytString {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if(s.isEmpty()){
        System.out.println("String is Empty");
    } else{
        System.out.println("String is not Empty");
    }
 }   
}
