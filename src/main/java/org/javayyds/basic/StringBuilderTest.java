package org.javayyds.basic;

/**
 * 1. String, 创建之后，包含在这个对象中的字符串是不可变的
 * 2. StringBuffer, 序列可变, 直到生成最后的string, toString方法
 * 3. StringBuilder, 一般默认采用这个，效率比上者更高，但是线程不安全，StringBuffer是安全的,
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = new String("abc");
        StringBuffer sbf = new StringBuffer("abc");
        sbf.append("e");
        sbf.insert(1, "f");
        StringBuilder sbd = new StringBuilder("abc");

    }
}
