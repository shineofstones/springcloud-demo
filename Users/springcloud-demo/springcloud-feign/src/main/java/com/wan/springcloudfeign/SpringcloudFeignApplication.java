package com.wan.springcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.wan")//不在springboot主启动路径，需配置扫描到controller
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.wan")//扫描feign接口com.wan.service
public class SpringcloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class, args);
    }
}
