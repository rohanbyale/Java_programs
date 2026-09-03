import java.util.Scanner;

/**
 * AverageElements
 */
public class AverageElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter array Elements one by one");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : a) {
            sum = sum + num;

        }
        System.out.println("Sum is " + sum);
        int average = sum / size;
        System.out.println("Average is " + average);

    }
}