package dayone;

/*
集合

ArrayList<E>
可调整大小的数组实现
<E>:是一种特殊的数据类型,泛型.
在出现E的地方我们使用引用数据类型替换即可
eg:ArrayList<String>,ArrayList<Student>
构造方法
public ArrayList()  创建一个空的集合对象
添加方法
public boolean add(E e) 将指定的元素追加到此集合的末尾
public void add(int index, E element) 在此集合中的指定位置插入指定的元素

ArrayList集合常用方法
public boolean remove(Object o) 删除指定的元素,返回删除是否成功
public E remove(int index)  删除指定索引初的元素,返回被删除的元素
Public E set(int index , E element) 修改指定索引处的元素,返回被修改的元素
public E get(int index)  返回指定索引处的元素
public int size() 返回集合中的元素个数
*/
//

import 学生管理系统.Student;

import java.util.ArrayList;

public class 集合基础 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student("leilei",10);
        Student s2 = new Student("xiaoxiao", 18);
        Student s3 = new Student("dada", 19);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        for (Student a : arrayList) {
            System.out.println(a);
        }
    }
}
