package test;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        String a = "91 27 46 38 50";
        String[] s = a.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        StringBuilder ss = new StringBuilder();
        for (int w : arr) {
            ss.append(w);
            ss.append(" ");
        }
        String s1 = ss.toString();
        String strip = s1.strip();
        System.out.println(strip);
    }
    public static String[] reset(String s) {
        String[] s1 = s.split(" ");
        Arrays.sort(s1);
        return s1;
    }
}
