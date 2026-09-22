import java.util.*;

class LeaderElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Leader Elements: ");

        for (int i = 0; i <= a.length - 1; i++) {
            boolean isgreater = true;

            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] >= a[i]) {
                    isgreater = false;
                    break;

                }
            }

            if (isgreater) {
                System.out.print(a[i] + " ");
            }

        }
    }
}