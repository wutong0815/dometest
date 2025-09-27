package org.example.demotest.designmodel.观察者模式.dome01;

public class LotteryResult {

    private String result;

    private String uId;

    public LotteryResult(String result, String uId) {
        this.result = result;
        this.uId = uId;
    }

    public String getResult() {
        return result;
    }

    public String getuId() {
        return uId;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "result='" + result + '\'' +
                ", uId='" + uId + '\'' +
                '}';
    }
}

