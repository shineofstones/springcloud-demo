package com.wan.springcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/22 19:44
 */
@RestController
public class FallbackController {
    @RequestMapping("fallback")
    public String fallback(){
        return "服务器繁忙，请稍后在试！！";
    }
}
