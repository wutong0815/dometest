package org.example.demotest.designmodel.单例模式.dome00;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Singleton_0 {

    /**
     * 单例模式
     */
    private Singleton_0() {
    }

    /**
     * 单例模式
     */
    public static Map<String,String> map = new ConcurrentHashMap<String,String>();
}
