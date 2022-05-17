/**
 * @author lei_lei
 * @version 1.0
 */
package 注解;


public class User {
    
    public int age;
    public int time;
    private String name;
    
    public User() {
    
    }
    public User(int age, int time, String name) {
        this.age = age;
        this.time = time;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", time=" + time +
                ", name='" + name + '\'' +
                '}';
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getTime() {
        return time;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
