public class printTable {

    public static void printTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }

    public static void main(String[] args) {
        printTable(5);
    }

}
