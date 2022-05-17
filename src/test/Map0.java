package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map0 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌", "赵敏");
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");

//        System.out.println(map.remove("郭靖"))

//
//        map.clear();

        System.out.println(map.containsKey("郭"));
        System.out.println(map.containsValue("黄"));
        System.out.println(map);
        System.out.println(map.size());
        Set<String> set = map.keySet();
        Collection<String> values = map.values();
        System.out.println(set);
        System.out.println(values);
        System.out.println(map.get("郭靖"));
        Set<Map.Entry<String, String>> set1 = map.entrySet();
        System.out.println(set1);

        for (String s : set) {
            System.out.println(map.get(s));
        }
        for (Map.Entry<String, String> stringStringEntry : set1) {
            System.out.println(stringStringEntry.getKey() + " " +stringStringEntry.getValue());
        }
    }
}
