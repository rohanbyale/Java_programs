public class MethodsDemo {
 
    public static void main(String[] args) {
        int num1 = 214;
        int num2 = 823;
        int num3 = 234;
        System.out.println(revers(num1));
        System.out.println(revers(num2));
        System.out.println(revers(num3));
    }

    public static int revers(int num) {
        int rev = 0;
        while (num != 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        return rev;
    }
}
