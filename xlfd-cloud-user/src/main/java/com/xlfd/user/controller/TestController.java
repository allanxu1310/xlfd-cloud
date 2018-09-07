package com.xlfd.user.controller;

import com.xlfd.user.service.HystrixTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * test
 * @auther Allan
 * @date 2018/7/24 20:16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    HystrixTestService hystrixTestService;

    @RequestMapping(value ="/test", method = RequestMethod.POST)
    public String test(){
        logger.info("====>test.............");
        return "test" ;
    }

    @RequestMapping(value = "/sayName",method = RequestMethod.GET)
    public String sayName(@RequestParam String name){
        logger.info("====>user-server: order-server通过feign 调用user-server的sayName()."+ name);
        return "hi order-server i am user-server."+name;
    }

    @RequestMapping(value = "/testHystrix",method = RequestMethod.GET)
    public String testHystrix(){
        return hystrixTestService.testHystrix();
    }



}
