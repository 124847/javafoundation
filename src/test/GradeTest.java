package test;

import java.util.Comparator;
import java.util.TreeSet;

public class GradeTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = (Integer.parseInt(o2.getMath()) + Integer.parseInt(o2.getChinese())) -
                        (Integer.parseInt(o1.getMath()) + Integer.parseInt(o1.getChinese()));
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });
        treeSet.add(new Student("1", 1, "5", "45", "154", "154"));
        treeSet.add(new Student("9", 1, "5", "45", "154", "154"));
        treeSet.add(new Student("4", 1, "5", "45", "154", "154"));
        treeSet.add(new Student("2", 1, "5", "45", "54", "14"));
        treeSet.add(new Student("3", 1, "5", "45", "14", "154"));
        for (Student student : treeSet) {
            System.out.println(student);
        }

    }
}
