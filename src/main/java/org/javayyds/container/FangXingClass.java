package org.javayyds.container;

public class FangXingClass<A> {

    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show() {
        System.out.println("id:" + id + ", a:" + a);
    }

    public A get() {
        return a;
    }

    public void set(A a) {
        System.out.println("执行：" + a);
    }
}
