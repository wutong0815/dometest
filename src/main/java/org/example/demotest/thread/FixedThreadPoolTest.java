package org.example.demotest.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
        Future<?> future = executorService.submit(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        executorService.shutdown();
    }
}
