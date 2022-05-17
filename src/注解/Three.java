/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Three {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("注解.User");
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println("---------------");
        User user = new User(1, 2, "12");
        Class<? extends User> aClass1 = user.getClass();
        System.out.println(aClass1.getName());
        System.out.println(aClass1.getSimpleName());
        System.out.println("--------------");
        for (Field field : aClass.getFields()) {
            System.out.println(field);
        }
        try {
            Field age = aClass.getField("age");
            
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        for (Method method : aClass.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println(aClass.getMethods().length);
        System.out.println("--------------");
        for (Method declaredMethod : aClass.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println(aClass.getDeclaredMethods().length);
        Method getName = aClass.getMethod("getName", null);
        
        Method getName1 = aClass.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(getName1);
    
        for (Constructor constructor : aClass.getConstructors()) {
            System.out.println(constructor);
        }
        Constructor constructor = aClass.getDeclaredConstructor(int.class, int.class, String.class);
        System.out.println(constructor);
        for (Constructor declaredConstructor : aClass.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }
        try {
            Object o = constructor.newInstance();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //        Arrays.stream(aClass.getFields()).forEach(System.out::println);
//        Arrays.stream(aClass.getDeclaredFields()).forEach(System.out::println);
    }
    
}
