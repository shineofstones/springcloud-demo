package com.wan.springcloudconsumerribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/21 12:45
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod = "fallback")//进行资源隔离和服务降级、请求熔断
    public String hello(){
        //调用注册中心的微服务
        String object = restTemplate.getForObject("http://PROVIDER-SERVER/student/query/2", String.class);
        return object+">"+Thread.currentThread().getName();
    }

    public String fallback(){
        return "网络繁忙，请稍后再试！！！";
    }
}
