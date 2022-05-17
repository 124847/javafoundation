package test;

public class IntegerTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(100);
        integer += 100;
        integer = Integer.valueOf (integer.intValue() + 100);
        System.out.println(integer);
    }
}
