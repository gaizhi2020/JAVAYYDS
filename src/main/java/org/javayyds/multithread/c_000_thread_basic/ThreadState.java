package org.javayyds.multithread.c_000_thread_basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadState {

    public static void main(String[] args) throws InterruptedException {
        // ==========================================
        Thread t1 = new Thread(() -> {
            System.out.println("2:" + Thread.currentThread().getState());
            for (int i = 0; i < 3; i++) {
                SleepHelper.sleepSeconds(1);
                System.out.print(i + " ");
            }
            System.out.println();
        });
        System.out.println("1:" + t1.getState());
        t1.start();
        t1.join();
        System.out.println("3:" + t1.getState());

        // ==========================================
        Thread t2 = new Thread(() -> {
            // 等待被叫醒
            LockSupport.park();
            System.out.println("t2 go on");
            SleepHelper.sleepSeconds(5);
        });

        t2.start();
        SleepHelper.sleepSeconds(1);
        // 睡一秒是为了确保等到时间片切到t2线程，不然还没执行到LockSupport.park();获取到的就是RUNNABLE了
        System.out.println("4:" + t2.getState());

        LockSupport.unpark(t2);
        // 确保上边执行完叫醒t2
        SleepHelper.sleepSeconds(1);
        System.out.println("5:" + t2.getState());

        // ==========================================
        final Object o = new Object();
        Thread t3 = new Thread(() -> {
            synchronized (o) {
                System.out.println("t3 竞争到锁 o");
            }
        });

        new Thread(() -> {
            synchronized (o) {
                SleepHelper.sleepSeconds(5);
            }
        }).start();

        t3.start(); // start 之后跟一个主线程sleep确保t3线程执行完成
        SleepHelper.sleepSeconds(1);
        System.out.println("6:" + t3.getState());

        Lock lock = new ReentrantLock();
        Thread t4 = new Thread(() -> {
            lock.lock();
            System.out.println("t4 竞争到了JUC锁 lock");
            lock.unlock();
        });

        new Thread(() -> {
            lock.lock();
            SleepHelper.sleepSeconds(5);
            lock.unlock();
        }).start();

        t4.start();
        SleepHelper.sleepSeconds(1);
        System.out.println("7:" + t4.getState());

        //WAITING状态，只有synchronized才会导致BLOCKED,因为会进入OS控制
        Thread t5 = new Thread(() -> {
            LockSupport.park();
        });

        t5.start();
        SleepHelper.sleepSeconds(1);

        System.out.println("8:" + t5.getState());
        LockSupport.unpark(t5);
    }
}
