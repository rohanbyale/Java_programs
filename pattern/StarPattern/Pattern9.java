package StarPattern;

//           *
//        *
//     *
// * 

public class Pattern9 {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            for(int j =1; j<=5; j++){
                if(i+j==6)
                    {
                    System.out.println(" * ");

                } else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
