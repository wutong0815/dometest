package org.example.demotest.designmodel.单例模式.dome01;

public class Singleton_1 {

    private Singleton_1 instance;

    /**
     * 单例模式
     */
    private Singleton_1() {
    }

    /**
     * 单例模式
     * @return
     */
    public Singleton_1 getInstance() {
        if (instance == null) {
            instance = new Singleton_1();
        }
        return instance;
    }
}
