package com.xlfd.order.controller;

import com.xlfd.order.client.UserServiceFeign;
import com.xlfd.order.service.HystrixTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    UserServiceFeign userServiceFeign;
    @Autowired
    HystrixTestService hystrixTestService;

    @RequestMapping(value ="/test", method = RequestMethod.POST)
    public String test(){
        logger.info("====>test.............");
        return "test" ;
    }

    @RequestMapping(value = "/sayName",method = RequestMethod.GET)
    public String sayName(@RequestParam String name){
        String result = userServiceFeign.sayName(name);
        logger.info("====>order-server: "+ result);
        return result;
    }

    @RequestMapping(value = "/testHystrix",method = RequestMethod.GET)
    public String testHystrix(){
        String result = userServiceFeign.testHystrix();
        return result;
    }

    @RequestMapping(value = "/hiHystrix",method = RequestMethod.GET)
    public String hiHystrix(){
        return hystrixTestService.hiHystrix();
    }

}
