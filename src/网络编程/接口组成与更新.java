package 网络编程;


/*


接口中的默认方法不是抽象方法不会被强制要求重写    但是重写也是可以的  public 可以省略但是 default不能被省略   重写的时候去掉default关键字


接口中静态方法  和类中定义是一样的
格式:public static 返回值类型方法名(参数列表){}
范例:public static void show(){}
接口中的静态方法只能被接口类名调用 不能通过实现类名或者对象名调用

接口中的私有方法
私有静态方法
静态方法只能调用静态
非静态方法可以调用非静态和静态


方法引用
方法引用符 ::

System.out::println

可以省略参数
eg
use(s -> System.out.println(s))
<==> use(System.out::println)
可推导的就是可省略的

方法引用是Lambda的孪生兄弟


Lambda表达式支持的方法引用
常见的引用方式
引用类方法
lambda表达式被类方法替代的时候,他的形式参数全部传递给静态方法作为参数
引用对象的实例方法
lambda表达式被对象实例方法替代的时候,他的形式参数全部传递给该方法作为参数
引用类的实例方法
lambda表达式被类的实例方法替代的时候 第一个参数作为调用者  后面的参数全部传递给方法作为参数作为参数
引用构造器
其实就是引用构造方法
类名::new
lambda表达式被构造器替代的时候,他的形式参数全部传递给构造器作为参数


 */


//
public class 接口组成与更新 implements RU{

    @Override
    public void qe() {
        System.out.println("抽象方法");

    }
}
