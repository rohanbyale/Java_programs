import java.util.*;

class SeparateOddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        int evencount = 0;
        int oddcout = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                evencount++;
            } else {
                oddcout++;
            }
        }

        int even[] = new int[evencount];
        int k = 0;
        int odd[] = new int[oddcout];
        int o = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                even[k] = a[i];
                k++;
            } else {
                odd[o] = a[i];
                o++;
            }
        }
        System.out.println("Number of even elements is " + evencount);
        System.out.println("Riteshn Elements are: " + Arrays.toString(even));
        System.out.println();
        System.out.println("Number of odd elements is " + oddcout);
        System.out.println("Odd Elements are: " + Arrays.toString(odd));
    }

}