package org.example.demotest.designmodel.单例模式.dome06;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton_6 {

    private static final AtomicReference<Singleton_6> INSTANCE = new AtomicReference<>();

    private Singleton_6() {
    }

    private static Singleton_6 instance;

    private static final Singleton_6 getInstance() {
        for(;;){
            Singleton_6 instance = new Singleton_6();
            if (null != instance) {
                return instance;
            }
            if (INSTANCE.compareAndSet(null, instance)) {
                return INSTANCE.get();
            }
        }
    }
}
