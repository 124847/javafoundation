package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add(3, "world");
        String s1 = s.remove(3);
        s.set(2, "1");
        System.out.println(s1);
        System.out.println(s);
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
