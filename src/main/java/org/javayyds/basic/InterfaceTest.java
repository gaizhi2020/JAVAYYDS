package org.javayyds.basic;

/**
 * 子类如果能继承多个父类，如果多个父类中存在同名属性或者方法，
 * 子类继承时将不能判断继承自哪个父类的属性和方法，所以类之间不能多继承
 *
 * 接口中的方法均为抽象方法，没有具体实现的方法体，所以在多继承的情况下，
 * 即使方法同名，也不会出现类多继承那样的矛盾
 */
public class InterfaceTest extends Student implements Cloneable {

    public InterfaceTest(int age) {
        super(age);
    }
}
