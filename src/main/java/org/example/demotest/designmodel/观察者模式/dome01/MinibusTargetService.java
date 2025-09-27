package org.example.demotest.designmodel.观察者模式.dome01;

public class MinibusTargetService {

    public String lottery(String uId){
        return Math.abs(uId.hashCode()) % 2 == 1 ? "恭喜你抽中了" : "很遗憾你没有抽中";
    }
}
