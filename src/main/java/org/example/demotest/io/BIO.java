package org.example.demotest.io;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class BIO {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        System.out.println(year);
        System.out.println("month is " + month);
        System.out.println("hour is " + hour);
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println("timeInMillis is " + timeInMillis);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(now.format(dateTimeFormatter));


    }
}
