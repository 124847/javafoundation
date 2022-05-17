package dayone;

/*
异常
                                    Throwable
   Error(严重问题不需要处理)                                           Exception(异常类,表示程序本身可以处理的问题)
                     RuntimeException(在编译期是不检查的,出现问题后,需要我们回来修改代码)         非RuntimeException
                                                                                (编译期间就必须要处理，否则不能通过编译)

JVM(java虚拟机)默认处理方案
如果程序出现了问题,我们没有做任何处理,最终JVM会做默认处理
把异常的名称,异常原因及异常出现的位置等信息输出在了控制台，程序停止执行，下面的语句就不会做了

异常处理

try... catch...
eg: try{
        可能出现异常的代码;
        } catch(异常类名 变量名){
        异常的处理代码;
        }

Throwable的成员方法
String                  getMessage()    返回此throwable的详细消息字符串。
String                  toString()        返回此可抛出的简短描述。
StackTraceElement[]     getStackTrace() 提供对 printStackTrace()打印的堆栈跟踪信息的编程访问。把异常的错误信息输出在控制台

编译时异常和运行时异常的区别
java中的异常被分为两大类:编译时异常和运行时异常，也被称为受检异常和非受检异常
所有的RuntimeException 类及其子类被称为运行是异常，其他的异常都是编译时异常
编译时异常:必须显示处理,否则程序会发生错误,无法通过编译 eg:ParseException 在日期解析的时候可能出现必须显示处理 编译时会提醒
运行时异常:无需显示处理,也可以和编译时异常一样处理   eg:ArrayIndexOutOfBoundsException   编译时不会提醒

异常处理 throws 异常类型 ，  将异常抛出，然后在相应调用方法的地方通过 try catch 可以使程序网下进行
编译时异常必须进行处理 使用try catch 或者 throws 异常类型   然后在相应调用方法的地方通过 try catch 可以使程序网下进行
ctrl at v

自定义异常
eg:
public class ScoreException extends Exception{
    public ScoreException(){
    }
    public ScoreException(String message){
    super(message);
    }
}



throws
用在方法声明后面,跟的是异常类名
表示抛出异常，由该方法的调用这来处理
表示出现异常的一种可能性，并不一定会发生这些异常

throw
用在方法体内,跟的是异常对象名
表示抛出异常，由方法体内的语句处理
执行throw一定是抛出了某种异常
 */

//
public class 异常 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("结束");
    }

    public static void method() throws RuntimeException {

            int[] arr = {1, 2, 3};

            System.out.println(arr[3]);
    }
}
