import java.util.Scanner;

public class FrequencyOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        for (int i = 0; i <= a.length - 1; i++) {

            boolean isPreviouslyPresent = false;

            for (int j = 0; j <= i - 1; j++) {
                if (a[j] == a[i]) {
                    isPreviouslyPresent = true;
                    break;
                }
            }

            if (isPreviouslyPresent == false) {
                int count = 0;
                for (int j = 0; j <= a.length - 1; j++) {
                    if (a[j] == a[i]) {
                        count++;
                    }
                }
                System.out.println(a[i] + " is repeated " + count + " time(s)");
            }
        }
    }

}
