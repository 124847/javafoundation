/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型.suo;

import java.util.ArrayList;

public class two {
    
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            
                new Thread(() -> {
                    synchronized (strings) {
                        strings.add(Thread.currentThread().getName());
                    }
                }).start();
            
        }
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    
        System.out.println(strings.size());
    }
    
}
