import java.util.Scanner;

/**
 * SumOfSubArray
 */
public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
        int maxsum = Integer.MIN_VALUE;
        System.out.println("Subarray are");
   

        for (int i = 0; i <= a.length - 1; i++) {
            int sum = 0;
            for (int j = i; j <= a.length - 1; j++) {

                 System.out.print(i + " , "+ j + " =");

                for (int m = i; m <= j; m++) {
                    // System.out.print(a[m]+" ");
                    sum = sum + a[m];

                }
                System.out.println(" sum = "+sum);
                if (sum > maxsum) {
                    maxsum = sum;
                }

                 System.out.println();
            }
        }
        System.out.println("Maximum SubArray sum is : " + maxsum);

    }
}