package org.example.demotest.designmodel.singlton.dome04;

public class Singleton_4 {

    public static Singleton_4 getInstance() {
        return SingletonHolder.instance;
    }

    private Singleton_4() {
    }

    private static class SingletonHolder {
        private static final Singleton_4 instance = new Singleton_4();
    }
}
