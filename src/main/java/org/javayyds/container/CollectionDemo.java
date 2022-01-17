package org.javayyds.container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 特点：
 * 1. 可以存放不同数据类型,而数组只能存放同一种数据类型
 * 2. 可以自动扩容,初始的容量是10, 每次扩容是变成原来oldCapacity的1.5倍
 *
 * api:
 * 1. add: 要求传入Object对象, 因此传入基本类型时包含了自动拆箱装箱过程
 * 2. addAll: 把另一个集合添加到该集合内
 * 3. clear: 清空集合内的元素,但该集合并没有被回收
 * 4. contains: 集合中是否包含该元素
 * 5. containsAll:是否包含另一个集合的所有元素,有一个没有就返回false
 * 6. equals: 相同的元素,相同的顺序
 * 7. parallelStream
 * 8. remove: 删除某个元素
 * 9. removeAll: 删除某些元素
 * 10. removeif: 删除符合条件的元素
 * 11. isEmpty: 集合是否为空
 * 12. retainAll: 包含集合的所有元素
 * 13. size: 集合大小
 * 14. toArray: 转为数组
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 接口是不能实例化的，所以new子类
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.33354);
        collection.add("test");
        System.out.println(collection);
        ((ArrayList) collection).add(0, "insert");
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        collection1.add("aaa");
        collection1.add("bbb");
        collection1.add("cc");
        collection1.add("dd");
        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println(collection.contains("aaa"));
        System.out.println(collection.contains(collection1));
        System.out.println(collection.containsAll(collection1));
        System.out.println("collection 包含所有collection1的元素" + collection.retainAll(collection1));
        System.out.println("collection1 包含所有collection的元素" + collection1.retainAll(collection));
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        collection.remove("bbb");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.contains("aaa"));
        System.out.println(collection.contains(collection1));
        System.out.println(collection.containsAll(collection1));

    }
}
