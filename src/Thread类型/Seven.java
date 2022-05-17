/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

import javax.sound.midi.Soundbank;

public class Seven {
    
    public static void main(String[] args) {
        myyield myyield = new myyield();
        for (int i = 0; i < 2; i++) {
            new Thread(myyield,i+"").start();
        }
    }
    
}

class myyield implements Runnable {
    
    
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
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
