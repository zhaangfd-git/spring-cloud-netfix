package com.sspring.netfix.study.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.nio.charset.Charset;

@Service
public class MyRequestInterceptor  implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        byte[] body = template.body();
        Charset charset = template.requestCharset();
        Type requestBodyType = template.methodMetadata().bodyType();
        String requestBody = new String(body, charset);
        System.out.println(requestBody);
    }
}
