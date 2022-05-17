package test;

import java.util.HashSet;

public class 哈希 {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("林青霞", 30);
        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
