package dayone;


/*
Math包含执行基本数字运算的方法

没有构造方法，如何使用类中的成员呢？
看类的成员是否都是静态的，如果是，通过类名就直接调用
int abs(int a) 返回参数的绝对值
double ceil(double a) 返回大于或等于参数的最小值double,等于一个整数  （入）
double floor(double a) 返回小于或等于参数的最大值double,等于一个整数 （舍）
int round(float a) 按照四舍五入返回最接近参数的int
int max(int a, int b) 返回两个int值中的较大值
int min (int a, int b) 返回两个int值中的较小值
double pow(double a, double b) 返回a的b次幂的值
double random() 返回值为double的正值,[0.0,1.0)

System类的常用方法
void exit(int status) 终止当前运行的虚拟机，非零表示异常终止
long currentTimeMillis() 返回当前时间(以毫秒为单位)

Object类的常用方法
类Object是类层次结构的根，每个类都有Object类作为超类。所有对象（包括数组）都实现了这个类的方法
一般重写toString方法比较好

equal方法
方法重写

冒泡排序

Arrays类的概述和常用方法
包含用于操作数组的各种方法
Arrays.toString(int[] a) 返回指定数组内容的字符串表示形式
Arrays.sort(int[] a) 按照升序排序
工具类的设计思想
不是没有构造方法
而是构造方法用private修饰
成员用public static修饰
 */
//

import 日期工具.DateUi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.stream.DoubleStream;

public class 常用API {
    public static void main(String[] args) throws ParseException {

    }
}
