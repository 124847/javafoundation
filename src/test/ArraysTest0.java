package test;

import java.util.Arrays;

public class ArraysTest0 {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 7, 4, 3, 9};
        System.out.println(arraytoString(a));
        Arrays.sort(a);
        System.out.println();
        for (int i = 0; i < a.length -1; i++) {
            boolean x = false;
            int temp;
            for (int j = 0; j < a.length - i -1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    x = true;
                }
            }
            if(!x){
                break;
            }
        }
        
        System.out.println(arraytoString(a));
    }

    public static String arraytoString(int[] arr) {
        StringBuilder s1 = new StringBuilder();
        s1.append('[');
        for (int i : arr) {
            s1.append(i);
            s1.append(',');
        }
        s1.deleteCharAt(s1.length() - 1);
        s1.append(']');
        String s = s1.toString();
        return s;
    }
}
