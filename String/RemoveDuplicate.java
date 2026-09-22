package String;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "AAABCBCD";
        String result = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);
        
    }
}
