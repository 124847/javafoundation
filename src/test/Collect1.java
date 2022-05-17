package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collect1 {
    public static void main(String[] args) {
        Collection<String> a = new ArrayList<>();
        System.out.println(a.add("hello"));
        System.out.println(a.add("world"));
        System.out.println(a.add("world"));
        System.out.println(a.contains("hello"));
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(a);
    }
}
