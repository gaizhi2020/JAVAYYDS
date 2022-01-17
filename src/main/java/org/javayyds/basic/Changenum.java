package org.javayyds.basic;

public class Changenum {

    /**
     * 不同方法不同的栈帧，如果要改变的话需要以数组的形势传递
     * @param args
     */
    public static void main(StringTest[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + "; b:" + b);
        changeNum(a, b);
        System.out.println("a:" + a + "; b:" + b);
    }
    public static void changeNum(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}
