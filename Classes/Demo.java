
// class Demo {

//     public static int k = 100;
//     public int j = 200;

//     public static void main(String[] args) {

//         System.out.println(A.i);
//         A obj = new A();
//         System.out.println(obj.m);
//     }

// }

// class A {
//     public static int i = 1;
//     public int m = 2;

//     public static void add() {
//         System.out.println("hello");
//     }
// }\

import java.util.Scanner;
import java.util.Arrays;


/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
    
        int [] a = new int[size];
        System.out.println("Enter array element one by one");

        for(int i = 0; i<=a.length -1;i++){

            a[i]= sc.nextInt();
        }

        
    }
}


