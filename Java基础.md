# 1. switch 支持类型

只支持byte,short,char,int,enum,String不支持long等其他

# 2. short s1 = 1;



# 3. /**wendan*/



# 4. &和&&区别

A&B A为false B依旧执行

A&&B A为false B就不执行了

```
i++ 先运算再加,++i
i = 1
int m = i++ + 2; // m = 3
int n = ++i + 2; // m = 4
```

& 还可以表示位运算，先转出二进制，再计算

```
1&3
```



# 5. final

以Math类为例

final修饰的类不可以被继承

final修饰的变量不可变，是指不可以改变引用，可以改变内容

final修饰的函数不能被重写



# 6. break;continue;return;



# 7. 结束多重循环

加标签

```
ok: for () {
	for () {
		if () {
			break ok;
		}
	}
}
```



# 8. java 面向对象特性

封装：提高对象安全性

继承：提高对象复用性

多态：提高对象扩展性；注意多态的话使用起来可能还不够使得代码最简洁，还得判断类型，最好的情况是使用反射；

# 9. 重载overload和重写override

重载发生在同一个类中，参数列表不同，重写发生在父子继承方法，参数列表相同，不能通过返回类型区分



# 10. ==和equals区别

==： 基础数据类型，比较的是值是否相等，引用数据类型，比较地址是否相等

equals: 没有重写则是等价于==，但一般重写之后，如String是比较内容是否相等



# 11. 交换

```
package org.javayyds.basic;

public class Changenum {

    /**
     * 不同方法不同的栈帧，如果要改变的话需要以数组的形势传递
     * @param args
     */
    public static void main(String[] args) {
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

```





# 12. Comparable内部比较器、Comparator外部比较器

外部比较器，更好的复用，优势

```
package org.javayyds.basic;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

    private int age;

    public Student(int age) {
        this.age = age;
    }

    /**
     * 重写比较逻辑
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

class StudentCompare {

    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(28);
        System.out.println(s1.compareTo(s2));
    }
}
```

```
package org.javayyds.basic;

import lombok.Data;

import java.util.Comparator;

@Data
public class Student2 {

    private int age;

    public Student2(int age) {
        this.age = age;
    }
}

class BijiaoXuesheng implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getAge() - o2.getAge();
    }
}

class StudentCompare2 {

    public static void main(String[] args) {
        Student2 s1 = new Student2(10);
        Student2 s2 = new Student2(28);
        Comparator comparator = new BijiaoXuesheng();
        System.out.println(comparator.compare(s1, s2));
    }
}

```



# 13. String s= "abc" 和String s = new String("abc")

```
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

```



# 14. String, StringBuffer, StringBuilder，底层都是数组

```
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

```



# 15. int 和 Integer区别

```
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

```



# 16. Java里的异常关键字

```
package org.javayyds.basic;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            // 执行网络连接,数据库连接
            // 代码逻辑
            eat2();
        } catch (Exception e) {
            // 捕获异常
        } finally {
            // 如果有网络连接,数据库连接 需要进行回收
        }
        eat();
    }

    private static void eat() {
        // throw 抛出异常
        throw new RuntimeException();
    }

    // throws 声明异常
    private static void eat2() throws Exception {
        throw new Exception();
    }
}

```



# 17. Java单继承,多实现接口

多实现接口方法不会冲突,多继承会冲突

```
package org.javayyds.basic;

/**
 * 子类如果能继承多个父类，如果多个父类中存在同名属性或者方法，
 * 子类继承时将不能判断继承自哪个父类的属性和方法，所以类之间不能多继承
 *
 * 接口中的方法均为抽象方法，没有具体实现的方法体，所以在多继承的情况下，
 * 即使方法同名，也不会出现类多继承那样的矛盾
 */
public class InterfaceTest extends Student implements Comparable, Cloneable {

    public InterfaceTest(int age) {
        super(age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

```



