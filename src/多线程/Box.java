package 多线程;

public class Box {
    public int milk;
    public boolean state = false;

    public synchronized void put(int value) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = value;
        System.out.println("送奶工将" + this.milk + "送了过来");
        this.state= true;
        this.notifyAll();
    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.state = false;
        System.out.println("用户拿到第"+milk+"瓶奶");
        this.notifyAll();
    }
}
