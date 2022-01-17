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
