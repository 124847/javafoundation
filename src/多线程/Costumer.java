package 多线程;

public class Costumer implements Runnable {
    private Box b;
    public Costumer(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}
