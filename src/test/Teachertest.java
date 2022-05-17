package test;

import java.util.Scanner;

public class Teachertest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.CheckScore(score);
        } catch (EX自定义异常 e) {
            e.printStackTrace();
        }
    }
}
