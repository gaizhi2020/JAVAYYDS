package org.javayyds.container;

import java.util.ArrayList;
import java.util.List;

public class DogTest {

    public static void main(String[] args) {
        Dog d1 = new Dog("旺1", "白色");
        Dog d2 = new Dog("旺2", "黑色");
        Dog d3 = new Dog("旺3", "黄色");
        List list = new ArrayList();
        list.add(d1);
        list.add(d2);
        list.add(d3);

        /**
         * 改写toString 方法才会打印内容
         */
        System.out.println(list);

        list.remove(d2);
        System.out.println(list);

        System.out.println(list.contains(d2));
        System.out.println(list.contains(d1));

        Dog d4 = new Dog("旺1", "白色");
        /**
         * 改写equals方法才会是true,即通过内容判断,不然判断的是地址,新new出来的地址不一样
         */
        System.out.println(list.contains(d4));

    }
}
