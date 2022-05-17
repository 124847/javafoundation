package test;

import java.util.TreeSet;

public class TreeSet0 {
    public static void main(String[] args) {
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
