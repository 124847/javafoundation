package 泛型;

import java.net.URL;

public class a {
    String name = "小狗";

    public void play() {
        System.out.println("我喜欢玩耍");
    }

    public void ha() {
        System.out.println("靠子");
    }

    public static
    void main(String[] args) {
        ClassLoader loader = a.class.getClassLoader();
        System.out.println(System.getProperty("user.dir"));
        URL resource = loader.getResource("jdbc.properties");
        System.out.println(resource);
    }
}
