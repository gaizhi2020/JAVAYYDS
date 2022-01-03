package org.javayyds.container;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet底层用的HashMap
 *
 * 1. HashSet 是无序但唯一的集合
 * 2. HashSet 不能通过下标get/set,因为无序
 *
 * TreeSet 底层用的tree是红黑树
 * 1. 数据都是同一类型
 * 2. add默认是进行排序,特殊的平衡二叉树,为了提高查询效率
 */
public class SetDemo {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add("a");
        set.add(true);
        set.add(1.34);
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 推荐使用for循环写,这样可以在循环结束时回收变量内存
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        // 错误写法
        TreeSet treeSet = new TreeSet();
        treeSet.add(332);
        treeSet.add(1);
        treeSet.add(52);
        System.out.println(treeSet);

    }
}
