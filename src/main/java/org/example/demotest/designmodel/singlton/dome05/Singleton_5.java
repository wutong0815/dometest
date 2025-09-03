package org.example.demotest.designmodel.singlton.dome05;

public class Singleton_5 {

    public static Singleton_5 getInstance() {
        if (instance != null) {
             return instance;
        }
        synchronized (Singleton_5.class) {
            if (instance == null) {
                instance = new Singleton_5();
            }
        }
        return instance;
    }

    private Singleton_5() {
    }

    private static Singleton_5 instance;
}
