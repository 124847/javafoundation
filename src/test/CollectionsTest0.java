package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest0 {
    public static void main(String[] args) {
        Student s1 = new Student("13", 18);
        Student s2 = new Student("13", 16);
        Student s3 = new Student("14", 18);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
