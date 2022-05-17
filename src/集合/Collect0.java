package 集合;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Lenovo
 */
public class Collect0 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("java");
        c.add("world");
        System.out.println(c.toString());
    }
}
