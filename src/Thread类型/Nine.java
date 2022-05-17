/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class Nine {
    public static void main(String[] args) {
    
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("...//..");
        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        while (thread.getState() != Thread.State.TERMINATED) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        }
    }
    
}
