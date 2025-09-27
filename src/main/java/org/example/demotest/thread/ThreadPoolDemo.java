package org.example.demotest.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class ThreadPoolDemo {

    // 监控指标
    private static final AtomicInteger completedTasks = new AtomicInteger(0);

    // 生产环境推荐使用ThreadPoolExecutor构造
    private static final ExecutorService pool = new ThreadPoolExecutor(
            4, // 核心线程数（对应4核CPU）
            8, // 最大线程数（4核*2）
            30, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(100), // 固定容量队列
            new CustomThreadFactory(),     // 自定义线程命名
            new CustomRejectionPolicy()    // 自定义拒绝策略
    );
    // 自定义线程工厂
    static class CustomThreadFactory implements ThreadFactory {
        private final AtomicInteger counter = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "BizPool-Thread-" + counter.getAndIncrement());
        }
    }
    // 自定义拒绝策略
    static class CustomRejectionPolicy implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.err.println("触发拒绝策略！任务总数: " + executor.getTaskCount());
            if (!executor.isShutdown()) {
                r.run(); // 由调用线程直接执行
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // 模拟任务提交
        for (int i = 0; i < 200; i++) {
            final int taskId = i;
            pool.submit(() -> {
                try {
                    // 模拟业务处理（IO密集型）
                    Thread.sleep(50);
                    completedTasks.incrementAndGet();
                    System.out.println(Thread.currentThread().getName()
                            + " 完成任务: " + taskId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // 平滑关闭
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("总完成任务数: " + completedTasks.get());
    }
}