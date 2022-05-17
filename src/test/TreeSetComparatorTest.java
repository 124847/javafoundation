package test;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorTest {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int x = (num == 0 ? o1.getName().compareTo(o2.getName()) : num);
                return x;
            }
        });

        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("西施", 29));
        set.add(new Student("王昭君", 28));
        set.add(new Student("貂蝉", 35));
        set.add(new Student("杨玉环", 33));

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
