package org.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemotestApplication.class, args);


        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("list");
        list.add("interface");
        System.out.println(list);


        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        System.out.println(hashMap);

    }

}
