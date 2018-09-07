package com.xlfd.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息生产者
 * @auther Allan
 * @date 2018/8/31 20:50
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    //生产者Send会像Queue=hello发送一条消息
    public void send(){
        String content = "hello " + new Date();
        System.out.println("Sender:" +content);
        this.rabbitmqTemplate.convertAndSend("hello", content);
    }
}
