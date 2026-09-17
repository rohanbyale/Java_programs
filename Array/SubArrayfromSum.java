import java.util.Scanner;

public class SubArrayfromSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Enter Target Sum : ");
        int target = sc.nextInt();
        boolean result = false;
        int minIndex = 0;
        int maxIndex = 0;

        outer: for (int i = 0; i <= a.length - 1; i++) {
            inner: for (int j = 1; j <= a.length - 1; j++) {
                int sum = 0;

                for (int m = i; m <= j; m++) {
                    sum = sum + a[m];

                }
                if (sum == target) {
                    result = true;
                    minIndex = i;
                    maxIndex = j;
                    break outer;
                }

            }
        }

        if (result == true) {
            for (int x = minIndex; x <= maxIndex; x++) {
                System.out.println(a[x] + "  ");
            }
        } else {
            System.out.println("There is no subarray matching to the target");
        }
    }

}
