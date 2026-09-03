
// import java.util.Arrays;
// import java.util.Scanner;

// public class ArrayDemo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array");
//         int size = sc.nextInt();

//         int a[] = new int[size];
//         System.out.println("Enter array element one by one");

//         for (int i = 0; i <= a.length - 1; i++) {
//             a[i] = sc.nextInt();

//         }

//         System.out.println(Arrays.toString(a));
//     }

// }

import java.util.Arrays;

/**
 * ArrayDemo
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int a[];
        /**
         * Declarration of array. a is getting defined in the stack
         * compile time
         */
        a = new int[5];

        a[0] = 23;
        a[1] = 24;
        a[2] = 34;
        a[3] = 55;
        a[4] = 56;

        /**
         * Arrays.toString(a)) - > this method convert arrays into String
         * Internally it used for Loop to print values
         */
        // System.out.println(Arrays.toString(a));  

        /**
         * intialization : Actullay here object is being created in the memory(heap)
         * this this happen at runtime this is called dynamic memory allocation
         * array objects are in heap
         */

        /**
         * -------------------------------------------->
         * for Each Loop
         * 
         */

        // for(int num : arr){ // for every element in the array print the array
        // System.out.println(num); -------> Here num represents element of the array
        // }

    }
}