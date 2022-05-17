/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型.suo;

import java.util.concurrent.CopyOnWriteArrayList;

public class Juc {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
    
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                strings.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
                e.printStackTrace();
        }
        System.out.println(strings.size());
    }
    
}
