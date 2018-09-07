package com.xlfd.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther Allan
 * @date 2018/8/31 20:57
 */
@Configuration  //@Configuration用于定义配置类，可替换xml配置文件
public class RabbitConfig {

    //建立一个消息队列hello
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
