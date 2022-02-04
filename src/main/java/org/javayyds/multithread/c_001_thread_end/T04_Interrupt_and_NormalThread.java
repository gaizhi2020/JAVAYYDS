package org.javayyds.multithread.c_001_thread_end;

import org.javayyds.multithread.c_000_thread_basic.SleepHelper;

public class T04_Interrupt_and_NormalThread {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (!Thread.interrupted()) {
                // wait, sleep
            }
            System.out.println("t end");
        });
        t.start();

        SleepHelper.sleepSeconds(2);

        t.interrupt();
    }
}
