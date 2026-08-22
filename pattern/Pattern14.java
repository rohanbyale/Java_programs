/*
 Pattern
                 1   
            3   5   
        7   9   11  
    13  15  17  19  
21  23  25  27  29
 
 */
public class Pattern14 {

    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i >= j) {
                    System.out.printf("%-4d", x);
                    x += 2;
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}