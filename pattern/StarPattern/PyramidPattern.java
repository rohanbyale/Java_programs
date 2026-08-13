package StarPattern;

public class PyramidPattern {
//             * 
//           *  *  * 
//        *  *  *  *  * 
//     *  *  *  *  *  *  * 
//  *  *  *  *  *  *  *  *  *
    public static void main(String[] args) {
        int start = 1;
        int space=4;
        for(int i = 1; i<=5; i++){

            // take a loop to print space
            for(int a = 1; a<=space; a++){
                System.out.print("   ");
            }
            
            // Take a loop to print star
            for(int b = 1; b<=start; b++){
                System.out.print(" * ");
            }
            space--;
            start+=2;
             System.out.println();
        }
       
    }
}
