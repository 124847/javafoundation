/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class Five {
    
    public static void main(String[] args) {
    
        ma x = () ->
            System.out.println("haha5");
        x.haha();
        new ma() {
            @Override
            public void haha() {
                System.out.println("yy");
            }
        }.haha();
    }
    
}

interface ma {
    void haha();
}



