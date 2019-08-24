package com.wan.springcloudgateway.controller;
import com.wan.api.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/21 17:17
 */
@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private IStuService stuService;
   /* @Autowired
    private IStudentService studentService;*/
    @RequestMapping("hello")//this.hashCode()判断是否为一个controller
    public String hello(){
        String query = stuService.query(2);
        return "当前结果为："+query+"=>"+Thread.currentThread().getName()+"->"+this.hashCode();

    }
}
