package dayone;

/*
集合类体系结构
                                                集合
                      Collection(单列)                                          Map(双列)
    List(可重复)                       Set(不可重复)                            HashMap ... TreeMap...
ArrayList LinkedList ...          HashSet LinkedHashSet   TreeSet ...

                                                                            接口 实现类
Collection集合的常用方法
使用父类引用指向子类对象 Collection a = new ArrayList;

boolean add (E e)  添加元素
boolean remove(Object o) 从集合中移除指定的元素
void clear()   清空集合中的元素
boolean contains(Object o) 判断集合中是否存在指定的元素
boolean isEmpty()   判断集合是否为空
int size()   集合的长度 也就是集合中元素的个数

alt 7   ctrl f12
shift f6


并发修改异常  迭代器的抛出异常


列表迭代器
通过List集合的listIterator()方法得到,所以它是List集合特有的迭代器
允许程序员沿任一方向遍历列表的列表迭代器,在迭代器期间修改列表，并获取列表中迭代器当前的位置


E previous()   返回列表中的上一个元素

boolean hasPrevious()   如果此列表迭代器在相反方向遍历列表时具有更多元素 则返回 true

也有 next 和 hasnext

void add (E e)   添加也比较常用



增强for循环 实现Iterable接口的类允许其对象成为增强型for语句的目标
它是jdk5之后出现的，其内部原理是一个Iterator迭代器
数组或者collection集合及其子类都可以


set 集合会去重    set是一个接口  所以可以使用多态  父类引用指向子类对象   可以使用它的一个实现类 hashset  编译看左边执行看右边



object 类中有一个方法 hashcode()可以获取对象的哈希值

默认情况下 不同对象的哈希指是不相同的
通过方法重写   可以实现不同对象的哈希值是相同的



HashSet 集合特点
底层数据结构是哈希表
对集合的迭代顺序不作任何保证，也就是说不保证存储和去除元素的顺序一致
没有带索引的方法，所以不能使用普通for循环遍历
由于是Set集合的子类，所以是不包含重复元素的集合




常见的数据结构之哈希表
jdk8 之前，底层采用数组+链表实现，可以说是一个元素为链表的数组

jdk8之后，在长度比较长的时候，底层实现了优化




LinkedHashSet 底层由哈希表和链表实现的set接口，具有可预测的迭代次序
    由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
    由哈希表保证元素的唯一性，也就是说没有重复的元素


TreeSet 集合概述和特点


元素有序 这里的数序不是指存储和取出的数序，而是按照一定的规则进行排序，具体的排序方式取决于构造方法
    TreeSet()  根据其元素的自然排序进行排序
    TreeSet(Comparator comparator)   根据指定的比较器进行排序

    自然排序和比较器排序就是定义CompareTo的位置不同 自然排序在源类中定义 comparator在main方法中定义

   由于没有带索引的方法  所以不能使用普通的for循环遍历
   由于是Set集合，所以不包括重复元素的集合


泛型接口
泛型接口的定义格式
格式 修饰符 interface 接口名 <类型> {
}

eg: public interface Generic <T>{
}


类型通配符号
为了表示各种泛型list的父类，可以使用类型通配符
类型通配符<?>
list<?>: 表示元素类型未知的list,它的元素可以匹配任何的类型

这种带通配符的list仅表示它时各种泛型 list 的父类 并不能把元素添加到其中

如果我们不希望list<?> 是任何泛型list的父类 只希望它表示某一类泛型list的父类，可以使用类型通配符的上限
类型通配符上限  <?extends 类型>
list<? extends Number>L 它表示的类型是Number或者其子类型

除了可以指定类型通配符的上限，我们也可以指定类型通配符的下限

类型通配符的下限 <? super 类型>
list<? super Number>: 它表示的类型是Number或者其父类型


可变参数 可变参数又称个数可变, 用作方法的形参出现，那么方法参数个数就是可变的了
format： 修饰符 返回值类型 方法名(数据类型 ... 变量名)
eg: public static int sum(int... a){}


//Map集合


interface Map<K,V>  每个键最多可以映射一个值
创建Map集合的对象
多态的方式实现类 HashMap
eg:Map<String,String> map = new HashMap<String,String>();

V put(K Key, V Value)

V remove(Object Key)

void clear()

boolean containsKey(Object key)

boolean containValue(Object value)

boolean isEmpty()

int size()


HashMap 键无序                 TreeMap 键有序


Collection类 此类仅由静态方法组合或返回集合。 它包含对集合进行操作的多态算法，“包装器”，返回由指定集合支持的新集合，以及其他一些可能的和最终的。
sort(List<T> list) 将指定的列表按升序排列
reserve(List<?> list)  反转指定列表中元素的顺序
shuffle(List<?> list)  使用默认的随机源随机排列指定的列表


*/
//


import java.io.*;

public class 集合体系 {
    public static void main(String[] args) throws FileNotFoundException {


    }
}
