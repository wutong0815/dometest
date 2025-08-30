package org.example.demotest.configuration;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final WorkerThread[] workerThreads;
    private volatile boolean isShutdown = false;

    /**
     * 创建线程池
     * @param poolSize 线程池大小
     */
    public ThreadPool(int poolSize) {
        this.taskQueue = new LinkedBlockingQueue<>();
        this.workerThreads = new WorkerThread[poolSize];

        // 创建并启动工作线程
        for (int i = 0; i < poolSize; i++) {
            workerThreads[i] = new WorkerThread("Worker-" + i);
            workerThreads[i].start();
        }
    }

    /**
     * 提交任务到线程池
     * @param task 要执行的任务
     */
    public void execute(Runnable task) {
        if (isShutdown) {
            throw new IllegalStateException("ThreadPool is shutdown");
        }

        try {
            taskQueue.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * 关闭线程池
     */
    public void shutdown() {
        isShutdown = true;
        for (WorkerThread worker : workerThreads) {
            worker.interrupt();
        }
    }

    /**
     * 等待所有任务完成
     * @param timeout 超时时间(毫秒)
     * @return 是否所有任务都已完成
     */
    public boolean awaitTermination(long timeout) throws InterruptedException {
        long endTime = System.currentTimeMillis() + timeout;
        for (WorkerThread worker : workerThreads) {
            long remainingTime = endTime - System.currentTimeMillis();
            if (remainingTime <= 0) {
                return false;
            }
            worker.join(remainingTime);
        }
        return true;
    }

    /**
     * 工作线程类
     */
    private class WorkerThread extends Thread {
        public WorkerThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!isShutdown || !taskQueue.isEmpty()) {
                try {
                    // 从队列中获取任务，如果没有任务则阻塞等待
                    Runnable task = taskQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    // 线程被中断，检查是否需要退出
                    if (isShutdown && taskQueue.isEmpty()) {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Task execution failed: " + e.getMessage());
                }
            }
        }
    }

    // 测试线程池
    public static void main(String[] args) throws InterruptedException {
        ThreadPool pool = new ThreadPool(3);

        // 提交10个任务
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " executing task " + taskId);
                try {
                    Thread.sleep(1000); // 模拟任务执行时间
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // 等待所有任务完成
        Thread.sleep(4000);
        pool.shutdown();
        pool.awaitTermination(5000);
        System.out.println("All tasks completed");
    }
}