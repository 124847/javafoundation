package 反射;


/*
反射概述
java反射机制:是指在运行时去获取一个类的变量和方法信息，然后通过获取到的信息来创建对象，调用方法的一种机制，由于这种动态性，可以极大的增强程序的灵活性
程序不用在编译期就完成确定,在运行期仍然可以扩展

获取Class类对象
我们要想通过反射去使用一个类，首先我们要获取到该类的字节码文件对象，也就是类型为class类型的对象
这里我们提供三种方式获取Class类型的对象

使用类的class属性来获取该类对应的Class对象
类名.class

调用对象的getClass()方法,返回该对象所属类对应的class对象
该方法是Object类中的方法，所有的Java对象都可以调用该方法

使用Class类中的静态方法forName(String className) 该方法需要传入字符串参数，该字符串参数的值是某个类的全路径，也就是完整包名的路径



反射获取构造方法并使用
用class对象调方法   生成class对象由上面三种方法按需生成
getConstructors()  返回一个包含Constructor对象的数组，Constructor对象反映了由该class对象表示的类的所有公共构造函数
getDeclaredConstructors 返回该class对象表示的类声明的所有的构造函数



getConstructor(Class<?> parameterTypes)  返回一个指定的类公共构造函数

getDeclaredConstructor(Class<?> parameterTypes)  返回一个指定的类或接口的构造函数

parameterType:  获取的构造方法参数的个数和数据类型对应的字节码文件对象  即类型.class     eg:String.class 等 按需要写


通过Constructor对象的newInstance(Object...initargs)  使用此方法创建一个类实例对象，默认返回Object类型的对象

基本数据类型也可以通过.class得到对应的class类型
eg int.class

暴力反射

public void setAccessible(boolean flag) 值为true,取消访问检查
class.forName("xxx").getDeclaredConstructor(String.class,int.class).setAccessible(True)
然后就可以调用private构造函数创建对象
con.newInstance("xxx",000)


反射获取成员变量并使用
返回Field对象的数组
getFields()  返回公共的成员变量

getDeclaredFields()  返回所有的成员变量

getField(String name) 返回指定的公共的成员变量    参数是变量的名字

getDeclaredField(String name) 返回指定的成员变量


field对象.set(obj,"西安") 给obj的成员变量赋值西安

public void setAccessible(boolean flag) 值为true,取消访问检查

field对象，setAccessible(True) 取消检查  暴力访问private修饰的成员变量


反射获取成员方法并使用

getMethods()  包括所有的公共方法 包括由类或接口生命的对象以及从超类和超级类接口继承的类


getDeclaredMethods()  包含所有的方法 不包含继承的


getMethod(String name, class<?> parameterTypes)  返回单个公共方法

getDeclaredMethod (String name, class<?> parameterTypes) 返回单个方法  name是方法名称 后面是参数类型 类型.class

Object invoke(Object obj,Object args)
最外面的object是返回值
method对象.invoke(类，参数)  即调用method对象方法

method对象.setAccessible(True) 取消访问检查 然后就可以访问私有方法


可以使用反射将Arraylist<Integer>中加入String类型的数据
创建一个集合
得到class对象
得到add方法
使用方法.invoke(集合对象，xxx) 传入xxx字符串


通过配置文件运行类中方法  .txt文件
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//
public class 反射 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class<?> name = Class.forName("反射.Student");
        Constructor<?> y = name.getConstructor();
        Object x = y.newInstance();
        Field age = name.getDeclaredField("age");
        age.setAccessible(true);
        age.set(x, 10);
        System.out.println(x);
    }
}
