import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        Vector<Integer> v2 = new Vector();
        v2.add(3);
        v2.add(4);
        v2.add(7);
        v2.add(8);

        v.retainAll(v2);
        System.out.println(v);

        for (int i = v.size() - 1; i >= 0; i--) {
            System.out.println(v.get(i));
        }
    }
}

