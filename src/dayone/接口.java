package dayone;


/*
接口概述
接口就是一种公共的规范标准，只要符合规范标准，大家都可以通用
java中的接口更多的体现在对行为的抽象
接口用关键字interface修饰
public interface 接口名{}
类实现接口用implements表示
public class 类名 implements 接口名{}
接口不能实例化
接口如何实例化 参照多态的方式，通过实现类对象实例化，这叫接口多态
多态的形式：具体类多态 抽象类多态 接口多态
多态的前提： 有继承或者实现关系 有方法重写 有父（类/接口）引用指向（子/实现）类对象
接口实现类
要么重写接口中的所有抽象方法
要么是抽象类


接口的成员特点
成员变量
只能是常量
默认修饰符 public static final
构造方法
接口没有构造方法 因为接口主要是对行为进行抽象的 是没有具体存在
一个类如果没有父类默认继承自object类
成员方法
只能是抽象方法
默认修饰符public abstract


类和接口的关系
类和类的关系
继承关系，只能单继承，但是可以多层继承
类和接口的关系
实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
接口和接口的关系
继承关系，可以单继承，也可以多继承


抽象类和接口的区别
成员区别
抽象类 ：常量 变量 有构造方法 有抽象方法 也有非抽象方法
接口   ：常量 抽象方法
关系区别
类与类 ：继承，单继承
类与接口 ：实现 可以单实现 也可以多实现
接口与接口 继承，单继承，多继承
设计理念的区别
抽象类： 对类抽象 包括属性 行为
接口 对行为抽象 主要是行为
抽象类和接口的区别
抽象类是对事物的抽象，而接口是对行为的抽象



抽象类名作为形参和返回值
方法的形参是抽象类名，其实需要的是该抽象类的子类对象
方法的返回值是抽象类名，其实返回的是该抽象类的子类对象


接口名作为形参和返回值
方法的形参是接口名，其实需要的是该接口的实现类对象
方法的返回值是接口名，其实返回的是该接口的实现类对象

 */
//


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class 接口 {
    public static void main(String[] args) {
        Map<String, Integer> s = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : s.entrySet()) {

        }
        Stream.of();
    }
}
