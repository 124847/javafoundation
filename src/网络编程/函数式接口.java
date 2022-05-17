package 网络编程;


/*
函数式接口：有且仅有一个抽象方法的接口
函数式接口就是lambda的前提

java的函数式编程体现就是lambda表达式,所以函数式接口就是可以适用于lambda使用的接口
只有确保接口中有且仅有一个抽象方法,java中的lambda才能顺利的进行推导

如果方法的返回值是一个函数式接口，我们可以使用lambda表达式作为结果返回

常用的函数式接口
Supplier接口
生产接口  get方法
Consumer接口
accept()
xx1.andThen(xx2)   先xxx1后xx2
Predicate接口
boolean test(T t)对给定的参数进行判断(判断逻辑由lambda表达式实现),返回一个布尔值
negate() 逻辑否
xxx.and(xxx) 逻辑或者
xxx.or(xxx)逻辑与
Function接口

T 函数输入的类型
R 函数结果
R apply(T t)
default <V> Function andThen(Function after): 返回一个组合函数，首先将该函数应用于输入，然后将after函数应用于结果
Function<T R> 接口通常用于对参数进行处理，转换(处理逻辑由lambda表达式实现),然后返回一个新的值
*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//
public class 函数式接口 {
    public static void main(String[] args) {
        convert("1000",Integer::parseInt,String::valueOf);
    }

    private static void convert(String w ,Function <String,Integer> q,Function<Integer,String> t) {
        String apply = q.andThen(t).apply(w);
        System.out.println(apply.getClass().getName());
    }
}
