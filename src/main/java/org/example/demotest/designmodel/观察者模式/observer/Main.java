package org.example.demotest.designmodel.观察者模式.observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        User user1 = new User("用户1", System.out::println);
        User user2 = new User("用户2", System.out::println);
        weatherStation.subscribe(user1);
        weatherStation.subscribe(user2);
        try {
            weatherStation.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
