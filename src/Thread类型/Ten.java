/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

/**
 * 优先级
 */
public class Ten extends Thread{
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"-->>"+Thread.currentThread().getPriority());
    
        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new nt(),""+i);
            if (i == 1) {
                thread.setPriority(10);
            }
            thread.start();
        }
   
    }

}


class nt implements Runnable {
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
        System.out.println(Thread.currentThread().getName()+"-->>"+Thread.currentThread().getPriority());
        
    }
}
