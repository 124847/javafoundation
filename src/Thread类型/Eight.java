/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class Eight  implements Runnable{
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
        for (int i = 0; i < 666; i++) {
            System.out.println("join来了"+i);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Eight());
    
    
        for (int i = 0; i < 600; i++) {
            
            if (i == 300) {
                thread.start();
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
    
}
