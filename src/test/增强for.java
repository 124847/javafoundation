package test;

import java.util.ArrayList;
import java.util.List;

public class 增强for {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 7, 8, 9};
        for (int i : a) {
            System.out.println(i);
        }

        List<String> list = new ArrayList<String>();
        list.add("he");
        list.add("he");
        list.add("we");

        for (String s : list) {
            System.out.println(s);
        }
        //如果异常则内部是Iterator迭代器

//        for (String s : list) {
//            if (s.equals("he")) {
//                list.add("5");
//            }
//        }
    }
}
