/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Five {
    public void test01(Map<String,User> a,List<Integer> b) {
    
    }
    public Map<String,User> test02() {
    
        return null;
    }
    
    
    public static void main(String[] args) throws NoSuchMethodException {
//        Method test01 = Five.class.getMethod("test02",null);
//        Type genericReturnType = test01.getGenericReturnType();
//        if (genericReturnType instanceof ParameterizedType) {
//            for (Type actualTypeArgument : ((ParameterizedType) genericReturnType).getActualTypeArguments()) {
//                System.out.println(actualTypeArgument);
//            }
//        }
    
        Method test01 = Five.class.getMethod("test01", Map.class, List.class);
        ArrayList<User> users = new ArrayList<>();
        Class<? extends ArrayList> aClass = users.getClass();
        Method add = aClass.getMethod("add", Object.class);
        try {
            add.invoke(users, "123");
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(users);
    
    }
    

}
