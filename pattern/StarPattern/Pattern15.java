package StarPattern;

public class Pattern15 {


/*

                *  *  *  *  * 
                   *  *  *  * 
                      *  *  * 
                         *  * 
                            * 
                         *  * 
                      *  *  * 
                   *  *  *  * 
                *  *  *  *  * 
*/
    public static void main(String[] args) {
        int star = 5;
        int space = 5;
        for (int i = 1; i <= 9; i++) {


            for (int b = 1; b <= space; b++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print(" * ");
            }

            if (i <= 4) {
                star--;
                space++;
            } else {
                star++;
                space--;
            }
            System.out.println();
        }

    }
}

