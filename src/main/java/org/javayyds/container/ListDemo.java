package org.javayyds.container;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(true);
        list.add(1);
        list.add("a");
        list.add(1.33);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));

        System.out.println(list.set(1, "b"));
        System.out.println(list);

        System.out.println(list.subList(2,4));

        List list1 = List.of(1, 2, 4, 6);
        System.out.println(list1);
    }
}
