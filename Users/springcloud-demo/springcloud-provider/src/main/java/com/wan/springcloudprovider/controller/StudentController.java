package com.wan.springcloudprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/20 17:45
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Value("${server.port}")
    private int port;
    @RequestMapping("query/{id}")
    public String query(@PathVariable Integer id){
        return "username:小明+》id：1>-----"+port;
    }
}
