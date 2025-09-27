package org.example.demotest.designmodel.观察者模式.observer;

import java.util.function.Consumer;

public class User {

    private final String name;

    private final Consumer<String> consumer;

    public User(String name, Consumer<String> consumer) {
        this.name = name;
        this.consumer = consumer;
    }


    public void receiveInfo(String info){
        consumer.accept(info);
        System.out.println(name + "收到了信息：" + info);
    }
}
