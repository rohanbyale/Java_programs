import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }

        }
        for (int i = min; i <= max; i++) {
            boolean isPresent = false;

            for (int j = 0; j <= a.length - 1; j++) {
                if (a[j] == i) {
                    isPresent = true;
                    break;
                }
            }

            if (isPresent == false) {
                System.out.println(i);
            }
        }
    }
}