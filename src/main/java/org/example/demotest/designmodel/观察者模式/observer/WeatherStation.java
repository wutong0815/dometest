package org.example.demotest.designmodel.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {


    private List<User> users = new ArrayList<>();
    public void subscribe(User user){

        users.add(user);
    }


    public String getInfo(){
        if (new Random().nextBoolean()){
            return "晴天";
        }
        return "雨天";
    }

    public void start() throws InterruptedException{
        while(true){
            String info = getInfo();
            users.forEach(user -> user.receiveInfo(info));
            System.out.println("天气更新了");
            Thread.sleep(3000);
        }
    }

}
