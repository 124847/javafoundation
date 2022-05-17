/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;

import javax.sound.midi.Soundbank;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;

public class one {
    
    
    @myin(name = "leilei",haha = {"1","2"})
    public void test() throws NoSuchMethodException {
        Method test = this.getClass().getMethod("test", null);
        myin annotation = test.getAnnotation(myin.class);
        System.out.println(annotation.name());
    
    }
    
    public static void main(String[] args) throws NoSuchMethodException {
        new one().test();
    }

}


@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value= RetentionPolicy.RUNTIME)
@interface myin {
    String name() default "";
    
    int age() default 0;
    
    int id() default -1;
    
    String[] haha();
}

