// class Main {
//     public static void main(String[] args) {
//         // int a[][] = { { 1, 2, 3, }, { 2, 3, 4, }, { 5, 6, 7 } };

//         int a[][] = new int[3][3];
//         a[0][0] = 10;
//         a[0][1] = 20;
//         a[0][2] = 30;
//         a[1][0] = 40;
//         a[1][1] = 50;
//         a[1][2] = 60;
//         a[2][0] = 70;
//         a[2][1] = 80;
//         a[2][2] = 90;

//         for (int i = 0; i <= a.length - 1; i++) {
//             for (int j = 0; j <= a[i].length - 1; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//--------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         // int a[][] = { { 1, 2, 3, }, { 2, 3, 4, }, { 5, 6, 7 } };
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter outer array size");
//         int size1 = sc.nextInt();

//         System.out.println("Enter inner array size");
//         int size2 = sc.nextInt();

//         int a[][] = new int[size1][size2];

//         System.out.println("Enter 2d array element one by one : ");
//         for (int i = 0; i <= a.length - 1; i++) {
//             for (int j = 0; j <= a[i].length - 1; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i <= a.length - 1; i++) {
//             for (int j = 0; j <= a[i].length - 1; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//----------------------------------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arr
 */
public class Arr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter outer array size");
        int outerSize = sc.nextInt();
        int a [][] = new int[outerSize][];

        System.out.println("Enter array element one by one");

        for(int i = 0; i<=a.length-1; i++){

            System.out.println("Enter "+(i+1)+"inner array size");

            int innerSize = sc.nextInt();

            a[i] = new int[innerSize];

            System.out.println("Enter "+(i+1)+" inner array elements one by one");

            for(int j = 0; j<=a[i].length-1;j++){
                a[i][j]= sc.nextInt();
            }

        }

        System.out.println("Given two dimensional jagged array is : ");

        for(int i = 0; i<=a.length-1; i++){
            for(int j = 0; j<=a[i].length-1; j++){
                System.out.println(a[i][j]);
            }
        }

    }
}