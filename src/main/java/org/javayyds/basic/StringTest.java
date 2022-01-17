package org.javayyds.basic;

public class StringTest {
    /**
     * s1和s2都是直接栈指向方法区
     * s3是指向new出来的堆内存，再指向方法区
     * s4是运行时编译，底层用的StringBuilder s.append s1, 然后append "",最后转成String
     * s5是跟s2一样，栈中直接指向方法区
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a" + "bc";
        String s3 = new String("abc");
        String s4 = s1 + "";
        String s5 = "abc" + "";

        // TODO: 2021/12/31 如何获取string变量的地址

        System.out.println("s1:" + s1.hashCode());
        System.out.println("s2:" + s2.hashCode());
        System.out.println("s3:" + s3.hashCode());
        System.out.println("..");
    }
}
