package 集合;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        HashMap<Integer,String> list = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        String[] flower = {"♥", "♣", "♦", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int num = 0;
        for (String s : number) {
            for (String s1 : flower) {
                keys.add(num);
                list.put(num++, s1+ s);
            }
        }
        keys.add(num);
        list.put(num++, "大王");
        keys.add(num);
        list.put(num++, "小王");
        Collections.shuffle(keys);
        Random rand = new Random();
        int zhong = rand.nextInt(51);
        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();
        TreeSet<Integer> C = new TreeSet<>();
        TreeSet<Integer> bottom = new TreeSet<>();
        for (int i = 0; i < keys.size(); i++) {
            if (i >= keys.size() - 3) {
                bottom.add(keys.get(i));
                continue;
            }
            if (i % 3 == 0) {
                A.add(keys.get(i));
            }
            if (i % 3 == 1) {
                B.add(keys.get(i));
            }
            if (i % 3 == 2) {
                C.add(keys.get(i));
            }
        }
        System.out.print("玩家A的手牌:");
        lookcard(A, list);
        System.out.print("玩家B的手牌:");
        lookcard(B, list);
        System.out.print("玩家C的手牌:");
        lookcard(C, list);
        System.out.print("底牌:");
        lookcard(bottom, list);
        System.out.println("地主牌:"+list.get(zhong));
        if (dizhu(zhong, A)) {
            System.out.println("A是地主");
        } else if (dizhu(zhong, B)) {
            System.out.println("B是地主");
        }else{
            System.out.println("C是地主");
        }
    }

    public static void lookcard(TreeSet<Integer> id,HashMap<Integer,String> allcord) {
        for (Integer integer : id) {
            System.out.print(allcord.get(integer) + " ");
        }
        System.out.println();
    }

    public static boolean dizhu(Integer zhong, TreeSet<Integer> x) {
        return x.contains(zhong);

    }
}
