import java.util.*;

public class PrintElement {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();
    v.add(10);
    v.add(20);
    v.add(30);
    v.add(40);
    v.add(50);
    v.add(60);

    for (Integer e : v) {
      if (e >= 35)
        System.out.println(e);

    }

    for (int i = 0; i <= v.size() - 1; i++) {
      if (v.get(i) >= 35) {
        System.out.println(v.get(i));
      }
    }
  }
}