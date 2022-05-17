package 集合;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class VariableParameter {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(1, 4, 54, 4, 4545, 5, 45, 45, 45, 45, 45, 45, 4));
//        返回由指定数组支持的固定大小的列表  Arrays.asList
//        List<String> list = Arrays.asList("sadasd", "asdasdas", "qdwe");
//        System.out.println(list);
////        list.add("sad");
////        list.remove("saas");
//        list.set(1, "sad");
//        System.out.println(list);

        //返回包含任意数量元素的不可变列表。
        List<String> list = List.of("adsas", "sadad", "sadas");
        System.out.println(list);
//        list.add("dsa");
//        list.remove("sadsdasdasd");
        list.set(1, "sadd");

        //返回一个包含任意数量元素的不可变集合。
//        Set<String> set = Set.of("sadad", "sadead", "sdadas", "sadasd"); //IllegalArgumentException
//        System.out.println(set);
//        set.add("asdas");
//        set.remove("sda");
    }


//

    private static int sum(int... a) {  //封装到a中 ，a其实是一个数组
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
