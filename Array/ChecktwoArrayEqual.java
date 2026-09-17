import java.util.Scanner;

class ChecktwoArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();

        int a[] = new int[size1];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int b[] = new int[size2];

        for (int i = 0; i <= b.length - 1; i++) {
            b[i] = sc.nextInt();
        }

        if (size1 != size2) {
            System.out.println("Not Equal");
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] != b[i]) {
                isEqual = false;
                break;
            }

        }

        if (isEqual) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}