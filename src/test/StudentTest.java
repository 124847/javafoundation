package test;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s);
        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);
        s2.toString();

        System.out.println(s2);
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s.getClass());
        /*public boolean equals(Object obj) {
        return (this == obj);
    }
    */
    }
}
