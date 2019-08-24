package com.wan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DESCRIPTION: 配置feign客户端，默认服务为注册中心名字
 * @Author:
 * @date 2019/8/21 17:19
 */
@FeignClient(value = "PROVIDER-SERVER",fallback = StuServiceImpl.class)
public interface IStudentService {

    @RequestMapping("student/query/{id}")
    String query(@PathVariable("id") Integer id);
}
