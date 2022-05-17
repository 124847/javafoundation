package dayone;

/*
File 是文件和目录路径名的抽象表示
文件和目录是可以通过File封装成对象的
对于File而言，其封装的闭并不是一个真正存在的文件，仅仅是一个路径名而已，它可以是存在的，也可以是不存在的

将来是要通过具体的操作把这个路径的内容转换为具体的存在


File(String pathname)  通过给定的路径名字符串转换为抽象路径名来创建新的File实例
File(String parent,String child)  从父类路径名字符串和子路径名字符串创建新的File实例
File(File parent, String child)  从父抽象路径名和子路径名字符串创建新的File实例



File类的创建功能
public boolean createNewFile()   当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
public boolean mkdir()   创建由此对抽象路径名命名的目录
public boolean mkdirs()  创建由此抽象路径名命名的目录,包括任何必需但不存在的父目录


File 类判断和获取功能

public  boolean isDirectory(){}  测试此抽象路径名表示的File是否为目录

public boolean isFile(){}     测试此抽象路径名表示的file是否为文件

public boolean exists(){}     测试此抽象路径名表示的file是否存在

public String getAbsolutePath(){}   返回此抽象路径的绝对路径名字符串

public String getPath(){}     将此抽象路径名转换为路径名字符串

public String getName(){}     返回由此抽象路径名表示的文件或目录的名称

public String[] list() {}       返回此抽象路径名表示的目录文件中的文件和目录的名称字符串数组

public File[] listFiles(){}    返回此抽象路径名表示的目录文件和目录的File对象数组

public boolean delete(){}     删除由此抽象路径名表示的文件或目录

删除一个目录时，如果一个目录中有内容(目录，文件) 不能直接删除，应该线删除目录中的内容，最后才能删除




字节流
IO流概述
IO 输入和输出
流 是一种抽象的概念 是对数据传输的总称 也就是说数据在设备间的传输称为流 流的本质是数据传输

IO流就是用来处理设备间数据传输问题的
常见的应用 ：文件复制 文件上传 文件下载

按照数据的流向   输入流：读数据  输出流：写数据

按照数据类型来分    字节流 字节输入流：字节输出流  字符流 字符输入流 字符输出流
一般可读文件是字符流   图片是字节流
如果不知道用什么流 就用字节流 字节流是万能的流


InputStream是所有字节输入流的超类
FileInputStream
OutputStream 是所有字节输出流的超类
f.write(int a)
f.write(bytes[] a)
f.write(bytes[] a,off,len)
FileOutputStream

finally 用来实现释放资源  除非JVM退出，否则一定会被执行
用在 try catch 后面
它们的子类名称都是以其父类名作为它们的后缀的


字节缓冲流内部封装了大小为8192的字节数组
字节缓冲输出流:BufferedOutputStream(OutputStream out)
字节缓冲输入流:BufferedInputStream(InputStream in)
字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作



字符流
一个汉字 GBK 2个字节  utf-8 占3个字节

字符流 = 字节流 + 编码表
InputStreamReader    OutputStreamWriter

子类 FileReader    子类FileWriter
用字节流复制文本时,文本文件也会有中文,但是没有问题，原因是最终底层操作会自动进行字节拼成中文
因为汉字在存储的时候，无论选择哪种编码存储，第一个字节都是负数

编码表
计算机中存储的信息都是用二进制数表示的，我们在屏幕上看到的英文，汉字等字符是二进制数据转换之后的结果

按照某种规则，将字符存储到计算机中，成为编码，反之将存储在计算机中的二进制数按照某种规则解析显示出来，称为解码，用GBK编码就得用
GBk解码，否则就会乱码， 即用哪种方法编码，就用哪种方法解码。

byte[] bys = "abc".getBytes(charsetName);  默认是右下角设置的
String s = new String(bys,charsetName);  默认是右下角设置的


字符流
InputStreamReader in = new InputStreamReader(new FileInputStream("xxx"),charsetName) 默认是右下角设置的

write(int c)  写一个字符
write(char[] buf) 写一个字符数组
write(char[] buf,int off,int len) 写一个字符数组的一部分
write(String str) 写一个字符串
write(String str,int off,int len) 写一个字符串的一部分
flush() 刷新流

close() 关闭流  先刷新后关闭



read() 一次读一个
read(char[] c) 一次读一个字符数组


不涉及编码问题时使用子类
FileReader
FileWriter


字符缓冲流
BufferedReader
特有功能
newline() 写一行
BufferedWriter
特有功能
readline() 读一行 读取含内容的字符串 不包括任何行终止字符(eg：换行符)


特殊操作流
System中的两个静态成员变量
标准输入流
InputStream s = System.in
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
system.in.println(br.readLine())
标准输出流
PrintStream s = System.out
s.println()
s.print()

即 System.out.println()

打印流
字节打印流
PrintStream ps = new PrintStream("xxx")
ps.write(xxx) 会进行转码  97 会变成a

ps.print(xxx)
ps.println(xxx) 原样存储   97 就是 97

字符打印流
PrintWriter pw = new PrintWriter(String fileName)   不会自动刷新
PrintWriter pw = new PrintWriter(new FileWriter(xxx),true)   会自动刷新

pw.println(xxx)


对象序列化流

对象序列化就是将对象保存在磁盘中，或者子啊网络中传输对象

这种机制就是使用一个字节序列表示一个对象，该字节序列包含 对象的类型 对象的数据和对象中存储的属性等信息
字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
反之，该字序列还可以从文件中读取回来，重构对象，对它进行反序列化

对象序列化流  ObjectOutputStream
对象反序列化流 ObjectInputStream


对象序列化流 ObjectOutputStream
构造方法  ObjectOutputStream(OutputStream out)   创建一个写入指定的OutputStream的ObjectOutputStream

序列化对象的方法
void writerObject(Object obj)  将指定对象写入ObjectOutputStream

类的序列化需要存的类实现Serializable接口
Serializable接口是标记接口，不需要实现任何方法

对象的反序列化流 ObjectInputStream
构造方法 ObjectInputStream(InputStream in)
反序列化方法
Object readObject()  从ObjectInputStream 读取一个对象


序列后 如果更改了类的内容   可能会使SerialVersionUID发生改变 再反序列化会报异常
解决办法使用序列化时最好显示声明SerialVersionUID的值
并且 SerialVersionUID 是 static final    long型的
static final long serialVersionUID = xxxL;

被transient修饰的成员变量不参与序列化
transient int age



Properties  没有泛型
是一个 Map体系的集合类
Properties 可以保存到六种或从流中加载
构造方法  new Properties()  创建集合对象

特有方法
Object setProperty(String key,String value)  设置集合的键和值 都是String类型 底层调用Hashtable(和Hashmap差不多都是键值对)方法 put

String getProperty(String key)   使用此属性列中何种指定的键搜索属性

Set<String> stringPropertyNames()   从该属性列表返回一个不可修改的键的集合,其中键及其对应的值是字符串


load(InputStream in)
load(Reader reader)
store(OutputStream out, String comments)
store(Writer writer,String comments)
 */

//


import java.io.*;

public class
IO流 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\Desktop\\考研教材");
        File dest = new File("D:\\Desktop\\英语六级");
        copys(src, dest);
    }

    private static void copys(File src, File dest) throws IOException {
        if (src.isDirectory()) {
            File temp = new File(dest, src.getName());
            if (!temp.exists()) {
                temp.mkdir();
            }

            for (File file : src.listFiles()) {
                if (file.isDirectory()) {
                    copys(file, temp);
                }else{
                    cc(file, new File(temp, file.getName()));
                }
            }
        }
    }


    public static void cc(File file, File dest) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        inputStream.close();
        outputStream.close();
    }
}
