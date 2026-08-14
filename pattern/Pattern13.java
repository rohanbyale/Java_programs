public class Pattern13 {
    public static void main(String[] args) {
        int x = 1;
        
        for(int i = 1; i<=5; i++){
            for(int j = 5; j>=1; j--){
                if(i>=j){
                    System.out.print(x+" ");
                    x= x+2;
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
