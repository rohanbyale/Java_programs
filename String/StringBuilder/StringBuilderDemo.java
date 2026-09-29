package String.StringBuilder;

/**
 * StringBuilderDemo
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        /**
         * 1. append()
         * 
         * Adds text at the end.
         */
        sb.append(" World");
        System.out.println(sb);
    }
}