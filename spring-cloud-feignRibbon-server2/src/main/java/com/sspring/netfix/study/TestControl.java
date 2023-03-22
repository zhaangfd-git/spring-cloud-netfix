package com.sspring.netfix.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestControl {

    @Value("${nacos.config:test}")
    private String testMessage;

    @RequestMapping("/echo")
    public  String echo(){
        return  "8802ok----"+ testMessage ;
    }

    @RequestMapping(value = "/echo1",method= RequestMethod.POST)
    public  String echo1(@RequestBody String  body){
        System.out.println(body);
        return  "8802ok----"+ testMessage ;
    }
}


