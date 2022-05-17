/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class one implements Runnable {
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
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        one one = new one();
        Thread thread = new Thread(one);
        thread.start();
    
        System.out.println("开始");
    }
}
