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

// Two pointers

import java.util.*;

public class Intersection {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        int left = 0;
        int right = v.size() - 1;

        while (left < right) {
            Integer temp = v.get(left);
            v.set(left, v.get(right));
            v.set(right, temp);

            left++;
            right--; 
        }

        System.out.println(v);
    }
}

// using collection 

import java.util.*;

public class ReverseVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();

        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
collection.reverse(v1);
sout
    }
}