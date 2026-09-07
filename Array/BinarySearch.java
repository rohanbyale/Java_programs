import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");

        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array element one by one  : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Element to Search : ");
        int target = sc.nextInt();

        boolean isPresent = false;
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int midIndex = (start + end) / 2;
            if (a[midIndex] == target) {
                isPresent = true;
                break;
            }

            if (target > a[midIndex]) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }

        }
        if (isPresent) {
            System.out.println(target + " is present in the array");
        } else {
            System.out.println(target + " is not present in the array");
        }

    }
}