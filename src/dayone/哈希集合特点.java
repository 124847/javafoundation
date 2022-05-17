package dayone;

import java.util.HashSet;

public class 哈希集合特点 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("11");
        set.add("21");
        set.add("31");
        set.add("11");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
