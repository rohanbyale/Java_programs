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
        // sb.append(" World");
        // System.out.println(sb);
        // --------------------------------------------------------->

        /**
         * 2. insert()
         * 
         * Adds text at a particular index.
         */

        // sb.insert(5, " World");
        // System.out.println(sb);

        // ---------------------------------------------------------->

        /**
         * 3. replace()
         * 
         * Replaces characters from start to end - 1.
         */

        // sb.replace(0, 5, "World");
        // System.out.println(sb);

        /**
         * 4. delete()
         * 
         * Deletes characters from start to end - 1.
         */

        // sb.delete(0,5 );
        // System.out.println(sb);

        /**
         * 5. deleteCharAt()
         * 
         * Deletes one character at a specific index.
         */

        // sb.deleteCharAt(1);
        // System.out.println(sb);

        /**
         * 6. reverse()
         * 
         * Reverses the StringBuilder.
         */

        // sb.reverse();
        // System.out.println(sb);

        /***
         * 7. setCharAt()
         * 
         * Changes a character at a particular index.
         */

        // sb.setCharAt(0, 'y');
        // System.out.println(sb);

        /**
         * capacity()
         * 
         * Returns the current capacity.
         */

        // System.out.println(sb.capacity());

        /**
         * ensureCapacity()
         * 
         * Increases capacity if required.
         */

        // sb.ensureCapacity(50);

        /**
         * setLength()
         * 
         * Changes the length.
         */
        // sb.setLength(3);
        // System.out.println(sb);

    }
}