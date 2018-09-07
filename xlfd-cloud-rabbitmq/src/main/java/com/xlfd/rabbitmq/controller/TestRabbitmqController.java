package com.xlfd.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/8/31 21:01
 */
@RestController
@RequestMapping("/send")
public class TestRabbitmqController {

    @Autowired
    Sender sender;

    @RequestMapping(value = "/testSend")
    public String testSend(){
        sender.send();
        System.out.println("sen(): success!");
        return "success";
    }
}
