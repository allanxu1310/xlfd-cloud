package com.xlfd.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/9/7 12:51
 */
@RestController
public class TestController {

    protected final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/sayLog")
    public String sayLog(){
        logger.info("sayLog test logback~");
        return "logback ok";
    }
}
