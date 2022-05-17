package 多线程;

public class Conducter implements Runnable {
    private Box b;
    public Conducter(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            b.put(i);
        }
    }
}
