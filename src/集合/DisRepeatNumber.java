package 集合;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DisRepeatNumber {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random r = new Random();
        while (set.size() < 10) {
            set.add(r.nextInt(20) + 1);
        }
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
