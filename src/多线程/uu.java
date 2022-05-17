package 多线程;

public class uu extends Thread {
    public uu() {
    }

    public uu(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"                 "+i);
        }
    }
}

