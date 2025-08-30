package org.example.demotest.controller;

import org.example.demotest.service.testService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    public testService testService;

    @GetMapping(value = "testAsync")
    public void testAsync() throws InterruptedException{
        for (int i = 0 ; i < 100 ; i++){
            System.out.println(testService.asyncWaiting());
        }
    }
}
