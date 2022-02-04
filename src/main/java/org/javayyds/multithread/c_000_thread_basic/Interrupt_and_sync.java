package org.javayyds.multithread.c_000_thread_basic;

public class Interrupt_and_sync {

    private static Object o = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (o) {
                SleepHelper.sleepSeconds(10);
            }
        });

        t1.start();

        SleepHelper.sleepSeconds(1);

        long start = System.currentTimeMillis();

        Thread t2 = new Thread(() -> {
            // 去竞争锁
            synchronized (o) {

            }
            System.out.println("竞争结束,耗时:" + (System.currentTimeMillis() - start) + "ms");
        });

        t2.start();

        // interrupt 不会影响竞争锁
        t2.interrupt();

    }
}
