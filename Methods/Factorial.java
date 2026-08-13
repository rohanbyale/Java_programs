// --> StaticMethodWithArgumentFactorial

/* ---> Problem Description
Write a program where you define a static method called checkEvenOdd.
The method should take an integer as argument and should not return anything.
If the number is even print "Even" otherwise print "Odd".

*/
import java.util.Scanner;

class Factorial {

    public static void checkFactoril(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkFactoril(num);

    }

}