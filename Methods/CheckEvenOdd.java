
//StaticMethodWithArgumentCheckEvenOrOdd

/**
 * Write a program where you define a static method called checkEvenOdd.
The method should take an integer as argument and should not return anything.
If the number is even print "Even" otherwise print "Odd".
 * CheckEvenOdd
 */

import java.util.Scanner;

class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEvenOdd(num);
    }

    public static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}