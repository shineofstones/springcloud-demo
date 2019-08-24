package com.wan.springcloudconsumerribbon;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringcloudConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced//调用注册中心微服务
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean//修改负载策略为随机策略
    public IRule getIRule(){
        return new RandomRule();
        }
    }

