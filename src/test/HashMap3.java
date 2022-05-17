package test;

import java.util.*;

public class HashMap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入！--------------");
        String s = scanner.next();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer m;
            Character n = s.charAt(i);
            if ((m = map.get(n) ) == null) {
                map.put(s.charAt(i), 1);
            }else{
                map.put(n, ++m);
            }
        }
        Set<Map.Entry<Character, Integer>> set1 = map.entrySet();

        for (Map.Entry<Character, Integer> characterIntegerEntry : set1) {
            System.out.println(characterIntegerEntry);
        }
    }
}
