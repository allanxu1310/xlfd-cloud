package com.xlfd.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @auther Allan
 * @date 2018/7/26 11:15
 */
@Service
public class HystrixTestService {

    //HystrixCommand
    @HystrixCommand(fallbackMethod = "hystrixFallback")
    public String testHystrix() { //throws InterruptedException {
        //调用服务提供者接口，正常则返回hello字符串
        //Thread.sleep(5000);  //将服务接口sleep来模拟网络延迟
        //return "hystrix test";

        int randomInt = new Random().nextInt(10);
        if (randomInt < 8) {  //模拟调用失败情况
            throw new RuntimeException("调用服务失败！");
        } else {
            return "调用服务成功！随机数是:" + randomInt;
        }
    }

    /**
     * 调用服务失败处理方法
     * @return “error"
     */
    public String hystrixFallback(){
        return "随机数小小于8，表示将要熔断！这是熔断器的降级方法。";
    }

    @HystrixCommand(fallbackMethod = "hystrixFallback")
    public String hiHystrix() {
        int randomInt = new Random().nextInt(10);
        if (randomInt < 7) {  //模拟调用失败情况
            throw new RuntimeException("调用服务失败！");
        } else {
            return "调用服务成功！随机数是:" + randomInt;
        }
    }
}
