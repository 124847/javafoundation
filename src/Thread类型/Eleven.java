/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Eleven {
    public static void main(String[] args) {
        god god = new god();
        you you = new you();
       new Thread(you).start();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        
       
    }
    
}

class god implements Runnable{
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
           
            System.out.println("always alive");
        }
        
    }
}

class you implements Runnable{
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
    
    
        for (int i = 0; i < 36500; i++) {
            System.out.println("happy"+i);
        }
        System.out.println("goodbye");
        
    }
}
