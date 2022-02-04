package org.javayyds.multithread.c_000_thread_basic;

public class Interrupt_and_Sleep {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // catch 之后标志位复位成了false
                System.out.println("Thread is interrupted");
                System.out.println(Thread.currentThread().isInterrupted());
            }
        });
        t.start();

        SleepHelper.sleepSeconds(5);

        t.interrupt();
    }
}
