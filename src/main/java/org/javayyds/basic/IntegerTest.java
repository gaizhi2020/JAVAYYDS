package org.javayyds.basic;

/**
 * Integer 包装类, 出了value方法等于int值,还封装了其他方法,自动拆箱
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer integer = new Integer(888);
        int i = 888;
        System.out.println(integer.intValue());
        System.out.println(integer.floatValue());
    }
}
