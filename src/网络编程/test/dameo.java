package 网络编程.test;

public class dameo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("...");
            }
        });
    }
}
