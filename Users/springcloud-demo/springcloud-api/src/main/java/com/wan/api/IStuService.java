package com.wan.api;
import com.wan.impl.Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DESCRIPTION:
 * @Author:
 * @date 2019/8/21 17:37
 */
@FeignClient(value = "PROVIDER-SERVER",fallback = Fallback.class)
public interface IStuService {

    @RequestMapping("student/query/{id}")
    String query(@PathVariable("id") Integer id);
}
