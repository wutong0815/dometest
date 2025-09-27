package org.example.demotest.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class dome {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10,
                10,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10));

        threadPoolExecutor.execute(() -> {
            System.out.println("线程池执行任务");
        });

        threadPoolExecutor.shutdown();
    }
}
