public class CheckGreater {

    /*
     * 
     * Create a static method checkGreater(int a, int b)
     * The method should take two numbers and return the greater number.
     * Test Case 1
     * Input: 10 20
     * Output: 20
     * Test Case 2
     * Input: 50 25
     * Output: 50
     * Test Case 3
     * Input: 7 7
     * Output: 7
     */
    public static void main(String[] args) {
        System.out.println(checkGreater(7, 7));
    }

    public static int checkGreater(int a, int b) {
        return (a > b) ? a : b;
    }

}
