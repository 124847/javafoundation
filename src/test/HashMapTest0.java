package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest0 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("1", 2),"1");
        map.put( new Student("1", 2),"2");
        map.put( new Student("3", 2),"3");
        map.put(new Student("4", 2), "4");
        Set<Map.Entry<Student,String>> set = map.entrySet();
        Set<Student> set1 = map.keySet();
        for (Student s : set1) {
            System.out.println(map.containsKey(new Student("1", 2)));
            System.out.println(map.get(s));
        }
        for (Map.Entry<Student, String> studentStringEntry : set) {
            System.out.println(studentStringEntry.getKey() +  " "+ studentStringEntry.getValue());
            System.out.println(studentStringEntry);
        }

    }
}
