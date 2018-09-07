package com.xlfd.order.client.hystrix;

import com.xlfd.order.client.UserServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @auther Allan
 * @date 2018/9/5 17:27
 */
@Component
public class UserServiceFeignHystrix implements UserServiceFeign{
    @Override
    public String sayName(String name) {
        return "sorry "+name;
    }

    @Override
    public String testHystrix() {
        return "hystrixError";
    }
}
