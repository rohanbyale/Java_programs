import java.util.*;

public class ReverseVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();

        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        for (int i = v.size() - 1; i >= 0; i--) {
            System.out.println(v.get(i));
        }
    }
}