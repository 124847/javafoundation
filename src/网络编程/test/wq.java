package 网络编程.test;

import java.util.function.Supplier;

public class wq {
    public static void main(String[] args) {
        int[] a = {1, 5, 70, 0};
        int max1 = getMax(() -> {
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            return max;
        });
        System.out.println(max1);
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
