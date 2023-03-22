package com.sspring.netfix.study.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestFeignControl {

    @Autowired
    private TestFeignInter testFeignInter;


    @Autowired
    private TestFeignInter02 testFeignInter02;


    @RequestMapping("/echo1")
    public  String echo(){

        return  testFeignInter.test();
    }

    @RequestMapping("/echo2")
    public  String echo2(){

        TestRequestBean t  = new TestRequestBean();
        t.setAge(18);
        t.setName("zhangSan");
        return  testFeignInter.test02(t);
    }
}


