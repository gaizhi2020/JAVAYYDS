package org.javayyds.multithread;

import java.util.concurrent.TimeUnit;

public class SleepHelper {

    public static void sleepSeconds(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
