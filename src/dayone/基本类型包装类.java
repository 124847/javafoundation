package dayone;


import java.text.ParseException;

/*
将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
常用的操作一:用于基本数据类型与字符串之间的转换
基本数据类型      包装类
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean


Integer 类的概述和使用
下面的静态方法代替了构造方法  构造方法已经过时 即new Integer(s)的方法已经过时
valueOf(String s)
valueOf(int i)
返回integer类型
parseInt(String s)
返回int 类型

int 和 String 的相互转换
public static String valueOf(int i)返回int参数的字符串表示形式。
该表示恰好是一个参数的Integer.toString方法返回的表示。
public static Integer valueOf(String s)
throws NumberFormatException
返回一个保存指定值的Integer对象String 。
该参数被解释为表示一个有符号的十进制整数，
就好像这个参数被赋予了
parseInt(java.lang.String)方法一样。
结果是表示由字符串指定的整数值的Integer对象。
换句话说，该方法返回一个Integer对象的值等于：
new Integer(Integer.parseInt(s))


public int intValue()返回 Integer的值作为 int 。


public static int parseInt(String s)
throws NumberFormatException
将字符串参数解析为带符号的十进制整数。
字符串中的字符都必须是十进制数字，
除了第一个字符可能是ASCII减号'-' （ '\u002D' ）
以指示负值或ASCII加号'+' （ '\u002B' ）表示正值。
返回所得到的整数值，就像参数和小数 10
被赋予parseInt(java.lang.String, int)方法的参数一样 。


public String[] split(String regex)将此字符串拆分为给定的regular expression的匹配。
该方法的工作原理是通过使用给定的表达式和极限参数为零调用双参数split方法。 因此，尾随的空字符串不会包含在结果数组中。

例如，字符串"boo:and:foo"使用以下表达式得到以下结果：

Split examples showing regex and result  Regex Result
: { "boo", "and", "foo" }
o { "b", "", ":and:f" }   最后面的oo不管了不用再添加""空字符串

参数
regex - 分隔正则表达式




自动装箱和拆箱
装箱：把基本数据类型转换为对应的包装类类型
拆箱：把包装类类型转换为对应的基本数据类型

在实际开发中，如果是个引用类型变量，使用之前要判断是否为null的判断
因为如果为null会出现空指针异常
只要是对象，在使用前就必须进行不为null的判断


日期类
Date until包下的这个(有好几个这里是until包下的)
构造方法
public Date()
分配一个Date对象,并初始化，以便它代表它被分配的时间，精确到秒
public Date(long time)
分配一个Date对象,并将其初始化为表示从基准时间起指定的毫秒数
Date类的常用方法
public long getTime()
获取的是日期对象从1970年1月1日0.0.0到现在的毫秒值
public void setTime(long time)
设置时间,给毫秒值



SimpleDateFormat

y 年 M 月 d 日 H 时 m 分 s 秒

构造方法
public SimpleDateFormat()
构造一个SimpleDateFormat,使用默认模式和日期格式
public SimpleDateFormat(String pattern)
构造一个SimpleDateFormat使用给定的模式和默认的日期格式

格式化(从Date到String)
public final String format(Date date): 将日期格式化成日期/时间字符串
解析(从String到Date)
public Date parse(String source) 从给定的字符串开始解析文本以生成日期


Calendar类
抽象类
使用Calendar c = Calendar.getInstance()创建对象
这个方法中其实就是多态的形式  创建对象

Calendar的常用方法
get() 返回给定日历字段的值
public abstract void add(int field,int amount) 根据日历规则，将指定的时间量
添加或减去给定的日历字段
public final void set(int year, int month, int date)
设置当前日历的年月日
 */
//
public class 基本类型包装类 {
    public static void main(String[] args) throws ParseException {
//        int i = new Scanner(System.in).nextInt();
//        Calendar c = Calendar.getInstance();
//        c.set(i, 2, 1);
//        System.out.println(c);
//        c.add(Calendar.DATE, -1);
//        System.out.println(c.get(Calendar.DATE));
        int s = 12345;
        Integer s1 = Integer.valueOf(s);
        s1.intValue();
        String s2 = String.valueOf(s1);
        System.out.println(s2.toString());
    }
}
