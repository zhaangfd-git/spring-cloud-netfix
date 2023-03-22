package com.sspring.netfix.study.feign;

import com.alibaba.fastjson.JSON;
import feign.RequestTemplate;
import feign.Util;
import feign.codec.EncodeException;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.openfeign.encoding.HttpEncoding;
import org.springframework.http.MediaType;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Objects;


public class JsonEncoder implements   Encoder {

    private final SpringFormEncoder springFormEncoder = new SpringFormEncoder();

    private Charset charset = StandardCharsets.UTF_8;;

    @Override
    public void encode(Object requestBody, Type bodyType, RequestTemplate request) throws EncodeException {
        if (requestBody == null) {
          return;
        }
        Collection<String> contentTypes = request.headers()
                .get(HttpEncoding.CONTENT_TYPE);

        MediaType requestContentType = null;
        if (contentTypes != null && !contentTypes.isEmpty()) {
            String type = contentTypes.iterator().next();
            requestContentType = MediaType.valueOf(type);
        }
        if (Objects.equals(requestContentType, MediaType.MULTIPART_FORM_DATA)) {
            this.springFormEncoder.encode(requestBody, bodyType, request);
            return;
        }
        request.headers(null);
        request.header("Content-Type","application/json");
        request.header(Util.CONTENT_ENCODING,charset.toString());
        String bodyJson = JSON.toJSONString(requestBody);
        request.body(bodyJson.getBytes(charset), charset);

        return;

    }

}
