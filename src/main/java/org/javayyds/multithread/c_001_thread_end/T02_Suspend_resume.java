package org.javayyds.multithread.c_001_thread_end;

import org.javayyds.multithread.c_000_thread_basic.SleepHelper;

public class T02_Suspend_resume {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("go on");
                SleepHelper.sleepSeconds(1);
            }
        });

        t.start();

        SleepHelper.sleepSeconds(5);

        t.suspend();

        SleepHelper.sleepSeconds(3);

        t.resume();
    }
}
