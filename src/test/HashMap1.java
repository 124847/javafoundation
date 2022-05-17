package test;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        Set<HashMap<String, String>> s = new HashSet<>();
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        s.add(hm1);
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("孙策", "大乔");
        hm2.put("周瑜", "小乔");
        s.add(hm2);
        HashMap<String, String> hm3= new HashMap<>();
        hm3.put("孙策", "大乔");
        hm3.put("周瑜", "小乔");
        s.add(hm3);
        for (HashMap<String, String> stringStringHashMap : s) {
            Set<Map.Entry<String, String>> set = stringStringHashMap.entrySet();
            for (Map.Entry<String, String> stringStringEntry : set) {
                System.out.println(stringStringEntry);
            }
        }
    }
}
