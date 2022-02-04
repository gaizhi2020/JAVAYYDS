package org.javayyds.multithread.c_001_thread_end;

import org.javayyds.multithread.c_000_thread_basic.SleepHelper;

public class T03_VolatileFlag {

    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            long i = 0L;
            while (running) {
                // wait,recv,accept 不适合
                i++;
            }
            System.out.println("end and i = " + i); // end and i = 1719305076; end and i = 1767023728
        });

        t.start();

        SleepHelper.sleepSeconds(1);

        running = false;
    }
}
