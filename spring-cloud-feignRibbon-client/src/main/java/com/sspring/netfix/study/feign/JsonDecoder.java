package com.sspring.netfix.study.feign;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;


public class JsonDecoder implements Decoder {
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        Response.Body body = response.body();
        int status = response.status();
        if(200 == status){
            String body2 = StreamUtils.copyToString(body.asInputStream(), Charset.forName("utf-8"));
            System.out.println(body2);
            return body2;
        }
        return null;
    }
}
