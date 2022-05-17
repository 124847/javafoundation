package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("1", new Student("1", 2));
        map.put("2", new Student("2", 2));
        map.put("3", new Student("3", 2));
        map.put("4", new Student("4", 2));
        Set<Map.Entry<String, Student>> set = map.entrySet();
        Set<String> set1 = map.keySet();
        for (String s : set1) {
            System.out.println(map.get(s));
        }

    }
}
