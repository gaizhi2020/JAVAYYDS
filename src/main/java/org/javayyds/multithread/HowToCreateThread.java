package org.javayyds.multithread;

import java.util.concurrent.*;

public class HowToCreateThread {

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Hello MyThread");
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello MyRunnable");
        }
    }

    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("Hello MyCallable");
            return "success";
        }
    }

    // 5种方式
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyThread().start();
        // implements 更好因为不像extend只能继承一个
        new Thread(new MyRunnable()).start();
        new Thread(() -> {
            System.out.println("Hello Lambda");
        }).start();

        // 不使用线程池，也可以有返回值，使用FutureTask
        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
        Thread t = new Thread(futureTask);
        t.start();
        String ft = futureTask.get();
        System.out.println(ft);

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
                System.out.println("Hello ThreadPool");
            }
        );

        Future<String> f = service.submit(new MyCallable());

        // get() 是阻塞类型的方法，意味着需要执行完拿到返回值才往下走
        String s = f.get();
        System.out.println(s);
    }
}
