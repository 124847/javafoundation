/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型.suo;

/**
 * 不安全买票
 */
public class one {
    
    public static void main(String[] args) {
        buyt buyt = new buyt();
        new Thread(buyt,"tom").start();
        new Thread(buyt,"cat").start();
        new Thread(buyt,"dog").start();
    }

}

class buyt implements Runnable{
    
    private int tic = 10;
    boolean falg = true;
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (falg) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            buy();
        }
    }
    
    private synchronized void buy() {
        if (tic <= 0) {
            falg = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"拿到"+tic--);
    }
}
