package org.example.demotest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class testService {

    @Async("myTaskExecutor")
    public Object asyncWaiting() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + "开始执行");
        Thread.sleep(1000);
        return null;
    }
}
