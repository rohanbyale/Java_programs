/**
 * Pattern12
 */
public class Pattern12 {

    public static void main(String[] args) {
        int space = 1;
        for(int i = 1; i<=5; i++){

            for(int a =1; a<=space; a++){
                System.out.print("  ");
              
            }
            for(int b =5; b>=space; b--){
                System.out.print(b+" ");
            }
              space++;
            System.out.println();
            
            
        }
    }
}