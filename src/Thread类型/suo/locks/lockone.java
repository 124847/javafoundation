/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型.suo.locks;

import java.util.concurrent.locks.ReentrantLock;

public class lockone {
    public static void main(String[] args) {
        loc loc = new loc();
        new Thread(loc).start();
        new Thread(loc).start();
        new Thread(loc).start();
        
    }
    
}

class loc implements Runnable{
    
    int tic = 10;
    ReentrantLock lock = new ReentrantLock();
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
        while (true) {
            lock.lock();
           try{
               if (tic > 0) {
                   try {
                       Thread.sleep(1000);
                   }
                   catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   
                   System.out.println(tic--);
               }
               else{
                   break;
               }
           }
           finally {
            
            lock.unlock();
           }
           
        }
    }
}
