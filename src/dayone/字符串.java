package dayone;


import java.awt.*;
import java.util.Scanner;

/*
API(Application Programming Interface); 应用程序编程接口
java.lang 下的类是不用导包的
String 类代表字符串,Java程序中所有字符串文字(例如"abc")都被实现为此类的实例
即java程序中所有的双引号字符串都是String的对象
字符串的特点字符串不可变，它们的值在创建后不能被更改
虽然String的值是不可变的，但是它们可以被共享
字符串效果相当于字符串数组(char[]),但是底层原理是字节数组(byte[])

String的构造方法
   public String()   创建一个空白字符串对象，不含任何内容
   public String(char[] chs) 根据字符数组的内容，来创建字符串对象
   public String(byte[] bys) 根据字节数组的内容，来创建字符串对象
   string s = "abc"     直接赋值的方式创建字符串对象,不含有任何内容
   byte a = 'a'或者 = 97    输出a都是97    因为byte是数值
   char a = 'a'或者 = 97    输出a 都是a    因为char是字符
    char[] a = {97,'a'};    String s = new String(a)  输出s为aa
    byte[] a = {97,'a'};    String s = new String(a)  输出s为aa  所以无论97 或者 a 到字符串中都变成 a

String对象的特点 通过new 创建的字符串对象 每一次new都会申请一个内存空间，虽然内容相同，但是地址不同
String s1 = new String(a)
String s2 = new String(a)
s1和s2的地址值不同
上面代码中,jvm会首先创建一个字符数组，然后每一次new的时候都会有一个新的地址,只不过s1和s2参考的字符串内容是相同的
以""方式给出的字符串,只要字符序列相同(顺序和大小写),无论在程序代码中出现几次,jvm都只会建立一个String对象,并在字符串中维护
即在常量池里 常量池里的内容不会重复所以只有唯一的地址

字符串的比较
使用 == 做比较 基本类型: 比较的是数据值是否相同 引用类型比较的是地址值是否相同
字符串是对象,它比较内容是否相同，是通过equals() 方法来实现的
字符串的遍历charAt 方法
String a = "12ab"
a.charAt(0)  输出即为1   String 类型不能用for each方法


拼接字符串
如果对字符串进行拼接操作,每次拼接,都会构建一个新的String对象,既耗时又浪费内存空间 而这种操作还不可避免，
我们可以通过java提供的StringBuilder类解决这个问题

StringBuilder是一个可变的字符串类 我们可以把它看成是一个容器
这里的可变值得是StringBuilder对象中的内容是可变的
String 内容是不可的
StringBuilder 内容是可变的
StringBuilder s = new StringBuilder();   无参构造
StringBuilder s = new StringBuilder("123");   带参数的构造
public StringBuilder append(任意类型)   添加数据并返回对象本身
public StringBuilder reverse()          返回相反的字符序列

StringBuilder 和 String相互转换
public String toString()   转为String
public StringBuilder (string s)   转为StringBuilder
*/
//
public class 字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 5;
        String a = "15";
        String b = "1";
        String c = b + "5";

        System.out.println(a == c);
    }
}
