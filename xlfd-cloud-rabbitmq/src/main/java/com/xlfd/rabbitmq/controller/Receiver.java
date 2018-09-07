package com.xlfd.rabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 * @auther Allan
 * @date 2018/8/31 20:54
 */
@Component
@RabbitListener(queues = "hello")   //监听hello队列
public class Receiver {

    @RabbitHandler  //指定对消息的处理方法
    public void process(String hello){
        System.out.println("Receiver: " + hello);
    }
}
