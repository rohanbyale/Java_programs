package Methodoverloading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        add(a, b);
        add(a, b, c);
        add(a, b, c, d);

    }

    public static void add(int a, int b) {
        System.out.println("Sum is : " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Sum is : " + (a + b + c));
    }

    public static void add(int a, int b, int c, int d) {
        System.out.println("Sum is : " + (a + b + c + d));
    }
}