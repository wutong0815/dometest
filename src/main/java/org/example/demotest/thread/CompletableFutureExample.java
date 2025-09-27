package org.example.demotest.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个异步任务
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("hello world");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "hello world";
        });
        //对异步任务进行处理
        CompletableFuture<String> future2 = future.thenApply(s -> {
            return s + "!";
        });
        //获取异步任务的结果
        String result = future2.get();
        System.out.println(result);

        //异步任务完成后执行
        future2.thenAccept(s -> {
            System.out.println(s);
        });

        CompletableFuture<Void> future3 = future2.thenRun(() -> {
            System.out.println("异步任务完成");
        });
        future3.get();
        System.out.println("异步任务完成");

    }

}
