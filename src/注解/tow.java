/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;

public class tow {
    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("注解.User");
            Class aClass1 = Class.forName("注解.User");
            Class aClass2 = Class.forName("注解.User");   
            System.out.println(aClass.hashCode());
            System.out.println(aClass1.hashCode());
            System.out.println(aClass2.hashCode());
        
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
        }
    }
    
    

