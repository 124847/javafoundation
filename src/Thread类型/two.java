/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class two extends Thread {
    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
    
    
    public static void main(String[] args) {
        two two = new two();
        two.start();
        System.out.println("开始");
    }
}
