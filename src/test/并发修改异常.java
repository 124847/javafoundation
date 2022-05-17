package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ConcurrentModificationException  并发修改异常


/*
public interface List<E>{
 Iterator<E> iterator();
boolean add(E e);
}

public abstract class AbstractList<E>{
protected transient int modCount = 0;
}
public class ArrayList<E> extends AbstractList<E>implements List<E>{

public Iterator<E> iterator() {
        return new Itr();
    }
public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }
private class Itr implements Iterator<E> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such
        int expectedModCount = modCount;
            expectedModCount 预期修改的集合次数
            modCount    实际修改集合的次数
        // prevent creating a synthetic constructor
        Itr() {}

        public boolean hasNext() {
            return cursor != size;
        }

        @SuppressWarnings("unchecked")
        public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }


        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }
*/

//
public class 并发修改异常 {
    public static void main(String[] args) {

        List<String> s = new ArrayList<>();

        s.add("hello");
        s.add("world");
        s.add("java");

        Iterator<String> ita = s.iterator();
        while (ita.hasNext()) {
            String a = ita.next();
            if (a.equals("world")) {
                s.add("java");       // expectedModCount 预期修改的集合次  modCount 实际修改集合的次数
                // 这两个数不同就会报错 迭代器在执行的过程中会有个方法进行判断这两个数是否相同
            }
        }
        System.out.println(s);

    }
}
