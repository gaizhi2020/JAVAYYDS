package org.javayyds.multithread.c_000_thread_basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Interrupt_and_lock {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("t1 end;" + (System.currentTimeMillis() - start) + "ms");
        });

        t1.start();

        SleepHelper.sleepSeconds(1);

        Thread t2 = new Thread(() -> {
            lock.lock();
            try {

            } finally {
                lock.unlock();
            }
            System.out.println("t2 end;" + (System.currentTimeMillis() - start) + "ms");
        });

        t2.start();

        SleepHelper.sleepSeconds(1);

        // 只是单纯设置标志位，并不能打断JUC锁竞争
        t2.interrupt();
    }
}
