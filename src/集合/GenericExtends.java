package 集合;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        List<? extends Number> s1 = new ArrayList<Number>();
        List<? extends Number> s2 = new ArrayList<Integer>();

    }
}
