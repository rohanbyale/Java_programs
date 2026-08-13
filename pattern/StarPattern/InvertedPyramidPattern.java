package StarPattern;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
//  *  *  *  *  *  *  *  *  * 
//     *  *  *  *  *  *  * 
//        *  *  *  *  * 
//           *  *  * 
//              * 

        int space = 0;
        int star = 9;
        for (int i = 1; i <= 5; i++) {

            // loop to print space
            for (int b = 1; b <= space; b++) {
                System.out.print("   ");
            }
            // take a loop to print star
            for (int a = 1; a <= star; a++) {
                System.out.print(" * ");
            }
            star -= 2;
            space++;

            System.out.println();
        }
    }
}
