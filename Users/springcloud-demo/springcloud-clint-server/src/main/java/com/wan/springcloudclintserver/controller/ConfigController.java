package com.wan.springcloudclintserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/22 21:11
 */
@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${com.name}")
    private String name;
    @RequestMapping("client")
    public String client(){
        return "读取的配置："+name;
    }
}
