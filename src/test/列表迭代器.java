package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 列表迭代器 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> ita = list.listIterator();
//
//        while (ita.hasNext()) {
//            System.out.println(ita.next());
//        }
//        while (ita.hasPrevious()) {
//            System.out.println(ita.previous());
//        }

        ListIterator<String> ita = list.listIterator();
        while (ita.hasNext()) {
            String s = ita.next();
            if (s.equals("world")) {
                ita.add("python");
            }
        }
        System.out.println(list);

    }
}
