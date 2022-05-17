package 集合;

import java.util.ArrayList;
import java.util.List;

public class GenericSuper {

    public static void main(String[] args) {
        List<? super Number> s = new ArrayList<Object>();
        List<? extends Number> s1 = new ArrayList<Number>();

    }

    public static void sat(List<? extends Number> a) {

        for (Number number : a) {
            System.out.println(number.toString());
        }
    }
}
