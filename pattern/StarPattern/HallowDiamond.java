package StarPattern;

public class HallowDiamond {
    
    /*
    
             * 
          *     * 
       *           * 
    *                 * 
 *                       * 
    *                 * 
       *           * 
          *     * 
             * 
    
    */
    public static void main(String[] args) {

        int space = 4;
        int star = 1;

        for (int i = 1; i <= 9; i++) {

            // Print spaces
            for (int a = 1; a <= space; a++) {
                System.out.print("   ");
            }

            // Print hollow diamond
            for (int b = 1; b <= star; b++) {

                if (b == 1 || b == star) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            // Increase/decrease spaces and stars
            if (i < 5) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

            System.out.println();
        }
    }
}
