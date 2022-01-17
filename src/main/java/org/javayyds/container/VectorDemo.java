package org.javayyds.container;

import java.util.Vector;

/**
 * Vector
 * 1. List接口的子类,
 * 2. 跟ArrayList一样底层也是数组
 * 3. 面试常问:
 *      ArrayList是线程不安全,效率高; Vector 是加了synchronized,线程安全,效率低
 *      ArrayList扩容grow操作是扩容为原来的1.5倍,Vector扩容为原来的2倍
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("a");
        vector.add(true);
        vector.add(1);
        vector.add(1.233);
        System.out.println(vector);

    }
}
