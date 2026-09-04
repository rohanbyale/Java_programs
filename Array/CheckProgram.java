import java.util.Scanner;

public class CheckProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int num : a) {
            if (num == n) {
                System.out.println("number is found");
            } else {
                System.out.println("Not found");
                break;
            }

        }
    }

}
