package String;

/**
 * ReverseaString
 */
public class ReverseaString {

    public static void main(String[] args) {
        String a = "Rohan";

        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            result = result + ch;

        }
        System.out.println(result);

    }
}