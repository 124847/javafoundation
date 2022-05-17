package test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSet0 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("sdasd");
        set.add("sss");
        set.add("sdasd");
//        System.out.println(set.toArray());

        Integer[] a = {1, 5, 8, 7, 9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
