/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Six {
    
    public static void main(String[] args) throws InterruptedException {
    
        Date date = new Date(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
           Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            date = new Date(System.currentTimeMillis());
        }
    }

}
