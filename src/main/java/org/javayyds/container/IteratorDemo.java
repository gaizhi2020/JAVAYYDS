package org.javayyds.container;

import java.util.*;

/**
 * 常用的循环方式
 * do...while
 * while
 * for
 * 循环增强
 *
 * 增强for循环本质上也是使用一个iterator
 *
 * 1. 所有集合类都默认实现了Iterable接口,实现该接口意味着具备了增强for循环
 * 增强for循环本质上使用的是iterator功能
 * 方法:
 * iterator
 * foreach
 *
 * 2. iterator方法中,要求返回一个Iterator的接口子类内部类实例
 * 此接口中包含
 * hasNext()
 * next()
 *
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 循环增强
        for (Object s : list) {
            System.out.println(s);
        }
        try {
//            while (iterator.hasNext()) {
//                Object item = iterator.next();
//                if (item.equals(1)) {
//                    iterator.remove();
//                }
//            }
            for (Object o : list) {
                Object item = o;
                if (item.equals(1)) {
                    list.remove(item);
                }
            }
        } catch(ConcurrentModificationException e) {
            System.out.println("remove error");
        }
        System.out.println(list);
        System.out.println("-------------------");
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        ListIterator listIterator = list2.listIterator();
        try {
            while (listIterator.hasNext()) {
                Object item = listIterator.next();
                if (item.equals(1)) {
                    listIterator.remove();
                }
            }
        } catch(ConcurrentModificationException e) {
            System.out.println("remove error2");
        }
        System.out.println(list2);



    }
}
