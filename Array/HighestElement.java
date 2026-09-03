import java.util.Scanner;

public class HighestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the array elements one by one");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        for (int num : a) {
            if (num > a[0]) {
                largest = num;
            }
        }
        System.out.println(largest);
    }

}
