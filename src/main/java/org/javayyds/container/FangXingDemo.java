package org.javayyds.container;

import java.util.ArrayList;
import java.util.List;

/**
 * 当对集合进行操作的时候，需要对集合的类型进行统一，此时需要泛型来规范
 *      优点：
 *      1. 数据安全
 *      2. 查询时效率高
 *      给集合的元素设置相同的类型，是泛型的基本需求
 *
 * 泛型的高阶应用：
 * 1. 泛型类
 *      定义类时候，在类名后边填写<E/A/B等字母>起到占位作用
 * 2. 泛型接口
 *      子类在实现，可以不填写泛型类型，此时在创建子类才决定泛型类型
 *      子类实现泛型接口，只在实现父类接口时候指定父类泛型即可，此时new出来的子类对象必须是该指定的类型
 * 3. 泛型类
 *      可以与泛型类不同的类型，解耦
 * 4. 泛型上限
 * 5. 泛型下限
 */
public class FangXingDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("true");
        list.add(new Person("zhangsan", 14).toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        FangXingClass<String> fangXingClass1 = new FangXingClass<>();
        fangXingClass1.setId(1);
        fangXingClass1.setA("mystring");
        fangXingClass1.show();

        FangXingClass<Integer> fangXingClass2 = new FangXingClass<>();
        fangXingClass2.setId(1);
        fangXingClass2.setA(34);
        fangXingClass2.show();

        FangXingClass<Person> fangXingClass3 = new FangXingClass<>();
        fangXingClass3.setId(1);
        fangXingClass3.setA(new Person("zhangsan", 19));
        fangXingClass3.show();
        System.out.println(fangXingClass3.get());
        fangXingClass3.set(new Person("lisi", 39));


        FangXingInterfaceSubclass fangXingInterfaceSubclass = new FangXingInterfaceSubclass();
        fangXingInterfaceSubclass.test2("123");

        FangXingMethod<String> fxm = new FangXingMethod<>();
        fxm.setT("ttt");
        fxm.show(123);
        fxm.show(true);

    }
}
