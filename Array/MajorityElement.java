import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        boolean isMajority = false;

        for (int i = 0; i <= a.length - 1; i++) {

            int count = 0;

            for (int j = 0; j <= a.length - 1; j++) {

                if (a[j] == a[i]) {
                    count++;
                }

            }

            if (count > (a.length / 2)) {
                System.out.println("Majority Element is " + a[i]);
                isMajority = true;
                break;
            }
        }
        if (isMajority == false) {
            System.out.println("no majority element is present");
        }

    }
}
