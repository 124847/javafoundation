/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型.suo.pc;

public class tepc {
    
    public static void main(String[] args) {
        syn syn = new syn();
        new pro(syn).start();
        new con(syn).start();
    }

}

class pro extends Thread{
    
    syn c;
    
    public pro(syn c) {
        this.c = c;
        
    }
    
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
     * @see #
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了"+i);
            c.push(new chicken(i));
        }
    }
}

class con extends Thread{
    
    syn c;
    
    public con(syn c) {
        this.c = c;
        
    }
    
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
     * @see #
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+i+c.pop().toString());
        }
    }
}


class chicken{
    int id;
    
    public chicken(int id) {
        this.id = id;
    }
}

class syn {
    chicken[] chickens = new chicken[10];
    
    int count = 0;
    public synchronized void push(chicken c) {
        if (count == chickens.length) {
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count++] = c;
        this.notifyAll();
    }
    
    public synchronized  chicken pop() {
        if (count == 0) {
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        chicken cw = chickens[count];
        this.notifyAll();
        return cw;
        
    }
    
}
