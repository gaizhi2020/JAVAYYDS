package org.javayyds.container;

import java.util.LinkedList;

/**
 * LinkedList
 * 提供丰富的API, 使用的时候查询官方文档即可
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add(true);
        list.add(1);
        list.add(1.234);
        System.out.println(list);

        list.add(3, "c");
        System.out.println(list);
        list.add(3, "d");
        System.out.println(list);

        list.addFirst("111");
        System.out.println(list);
        list.addLast("222");
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list);
        System.out.println(list.peekLast());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);

    }
}
