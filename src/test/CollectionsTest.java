package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(90);
        list.add(50);
        list.add(80);
        list.add(70);
//        Collections.sort(list);
//        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
