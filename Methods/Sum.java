/*

Write a Java program where you define a static method addNumbers(int a, int b)
The method should take two numbers as arguments and return their sum.

Test Case 1
Input: 5 10
Output: 15

Test Case 2
Input: -3 7
Output: 4

Test Case 3
Input: 0 8
Output: 8

*/

import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println(addNumbers(a, b));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}