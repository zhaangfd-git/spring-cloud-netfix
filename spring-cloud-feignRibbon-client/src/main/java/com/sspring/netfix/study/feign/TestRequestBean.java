package com.sspring.netfix.study.feign;

import java.io.Serializable;

/**
 * @author: zhangfd
 * @date: 2023/3/6 0:14
 * @version: 1.0
 * @describe:
 */
public class TestRequestBean implements Serializable {

    private  String name;

    private  Integer  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
