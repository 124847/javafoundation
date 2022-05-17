package 文件;

public class Robbit {
    public static void main(String[] args) {
        System.out.println(f(20));
        System.out.println(x(5));
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    public static int x(int n) {
        if (n == 1) {
            return 1;
        }
        return n * x(n - 1);

    }
}
