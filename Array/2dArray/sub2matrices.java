
public class sub2matrices {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

        int b[][] = { { 1, 2, 3, }, { 1, 2, 3 }, { 1, 2, 3 } };

        System.out.println("Out put after adding given array elements : ");

        int c[][] = new int[3][3];

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = 0; j <= a[i].length - 1; j++) {

                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");

            }
            
            System.out.println();
        }

    }
}
