package com.xlfd.order.client;

import com.xlfd.order.client.hystrix.UserServiceFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserServiceFeign
 * @auther Allan
 * @date 2018/9/5 16:32
 */
//Feign是自带断路器的，在D版本的Spring Cloud之后，它没有默认打开。需要在配置文件中配置打开它，在配置文件加以下代码： feign.hystrix.enabled=true

@FeignClient(value = "user-server", fallback = UserServiceFeignHystrix.class)
public interface UserServiceFeign {

    @RequestMapping(value = "test/sayName",method = RequestMethod.GET)
    String sayName(@RequestParam(value = "name") String name);

    @RequestMapping(value = "test/testHystrix",method = RequestMethod.GET)
    String testHystrix();
}
