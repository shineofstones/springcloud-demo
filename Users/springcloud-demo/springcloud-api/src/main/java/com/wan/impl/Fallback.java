package com.wan.impl;
import com.wan.api.IStuService;
import org.springframework.stereotype.Component;

/**
 * @DESCRIPTION:
 * @Author: wanleilei
 * @date 2019/8/21 19:01
 */
@Component
public class Fallback implements IStuService {
    @Override
    public String query(Integer id) {
        return "服务器异常，请稍后再试！！！";
    }
}
