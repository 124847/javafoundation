package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionGeneric {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("w");
        c.add("wor");
        c.add("m");
        Iterator<String> ita = c.iterator();
        while(ita.hasNext()) {
            String next =  ita.next();//ClassCastException
            System.out.println(next);
        }
    }
}
