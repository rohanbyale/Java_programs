package StarPattern;

public class PascalTriangle {
    
    /*
    
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
1 5 10 10 5 1 

    */
    public static void main(String[] args) {
        int space = 5;
        int starspace = 1;

        for(int i = 1; i<=6; i++){

            for(int a = 1; a<=space; a++){
                System.out.print(" ");
            }

            int x = 1; 
            int num = i-1;
            int den = 1;

            for(int b = 1;b<=starspace; b++){
                System.out.print(x+" ");
                x= (x*num)/den;
                num--;
                den++;
            }
            space--;
            starspace++;
            System.out.println();
        }
    }
}
