package org.javayyds.multithread.c_000_thread_basic;

public class Interrupt_and_IsInterrupted {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (;;) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("isInterrupted");
                    System.out.println(Thread.currentThread().isInterrupted());

                    // 这是比较优雅的结束线程的方式
                    break;
                }
            }
        });
        t.start();

        SleepHelper.sleepSeconds(2);
        t.interrupt();
    }
}
