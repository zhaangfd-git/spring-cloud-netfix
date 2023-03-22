package com.sspring.netfix.study.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestControl {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/echo")
    public  String echo(){

        return  restTemplate.getForObject("http://nacos-config/test/echo/",String.class);
    }
}


