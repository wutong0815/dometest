package org.example.demotest.designmodel.单例模式.dome02;

public class Singleton_2 {

    private Singleton_2 instance;

    /**
     * 单例模式
     */
    private Singleton_2() {
    }

    /**
     * 单例模式
     * @return
     */
    public synchronized Singleton_2 getInstance() {
        if (instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }
}
