package test;

import java.util.*;

public class HashMap2 {

    public static void main(String[] args) {
        HashMap<String, HashSet<String>> map = new HashMap<>();

        HashSet<String> list = new HashSet<String>();
        list.add("15");
        list.add("16");
        list.add("17");
        list.add("18");
        HashSet<String> list1 = new HashSet<>();
        list1.add("15");
        list1.add("16");
        list1.add("17");
        list1.add("18");
        HashSet<String> list2 = new HashSet<>();
        list2.add("15");
        list2.add("16");
        list2.add("17");
        list2.add("18");

        map.put("1", list);
        map.put("2", list1);
        map.put("3", list2);
        Collection<HashSet<String>> lists = map.values();
        HashSet<HashSet<String>> v = new HashSet<>();
        for (HashSet<String> strings : lists) {
            v.add(strings);
        }
        for (HashSet<String> strings : v) {
            System.out.println(strings);
        }

    }

}
