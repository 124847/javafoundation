/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.*;

/**
 * 实现callable
 */
public class Three implements Callable<Boolean> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     *
     * @throws Exception
     *         if unable to compute a result
     */
    @Override
    public Boolean call() throws Exception {
        int i = new Random().nextInt(10) * 1000;
        System.out.println(i);
        Thread.sleep(i);
        System.out.println(Thread.currentThread().getName());
        return true;
    }
    
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Future<Boolean> submit = executorService.submit(new Three());
        }
    
        
        executorService.shutdown();

    
    }
    
    
}
