package com.sspring.netfix.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: zhangfd
 * @date: 2023/3/5 22:37
 * @version: 1.0
 * @describe:
 */
@FeignClient(name = "nacos-config")
public interface TestFeignInter {

    @GetMapping("/test/echo/")
    public  String test();

    @PostMapping("/test/echo1/")
    public  String test02(TestRequestBean testRequestBean);

}
