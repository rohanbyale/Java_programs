package StarPattern;

public class DiamondPattern {
    public static void main(String[] args) {

        
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         *

        int space = 4;
        int star = 1;
        for (int i = 1; i <= 9; i++) {
            // Take a Loop to print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // take a loop to print stars
            for (int a = 1; a <= star; a++) {
                System.out.print("* ");
            }

            if (i <= 4) {
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
