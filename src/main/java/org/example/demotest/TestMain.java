package org.example.demotest;

import java.util.concurrent.ThreadFactory;

public class TestMain {

//    public static void main(String[] args) {
//        // 定义一个 Runnable 任务，用于打印当前线程信息
//        Runnable printThread = () -> System.out.println(Thread.currentThread());
//
//        // 创建一个虚拟线程工厂
//        ThreadFactory virtualThreadFactory = Thread.ofVirtual().name("virtual-thread-", 0).factory();
//
//        // 使用虚拟线程工厂创建一个新的虚拟线程，并将 printThread 作为任务
//        Thread virtualThread = virtualThreadFactory.newThread(printThread);
//
//        // 启动虚拟线程
//        virtualThread.start();
//
//        try {
//            // 等待虚拟线程执行完毕
//            virtualThread.join();
//        } catch (InterruptedException e) {
//            // 处理线程中断异常
//            Thread.currentThread().interrupt();
//            e.printStackTrace();
//        }
//    }
}