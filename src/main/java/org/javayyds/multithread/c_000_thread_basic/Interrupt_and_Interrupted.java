package org.javayyds.multithread.c_000_thread_basic;

public class Interrupt_and_Interrupted {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (;;) {
                if (Thread.interrupted()) {
                    System.out.println("Thread interrupted");
                    System.out.println(Thread.interrupted());
                }
            }
        });
        t.start();

        SleepHelper.sleepSeconds(2);
        t.interrupt();

        // 这里查询的是main函数主线程的
        System.out.println("main:" + t.interrupted());
    }
}
