/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Six {
    public static void main(String[] args) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("注解.Student");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            leilei annotation1 = (leilei) annotation;
            System.out.println(annotation1.value());
        }
        leilei annotation =aClass.getAnnotation(leilei.class);
        System.out.println(annotation.value());
    
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            filei annotation1 = declaredField.getAnnotation(filei.class);
            System.out.println(annotation1.columname() + annotation1.type() + annotation1.length());
            System.out.println("------------");
        }
    }
    
}


@leilei("hah_student")
class Student {
    @filei(columname = "haha_id",type = "int",length = 10)
    private int id;
    @filei(columname = "haha_age",type = "int",length = 10)
    private int age;
    @filei(columname = "haha_name",type = "varchar",length = 10)
    private  String name;
    
    public Student(int age) {
        this.age = age;
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}



@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface leilei {
    String value();
}

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface filei {
    
    String columname();
    
    String type();
    
    int length();
}

