package com.test.aop.demo;

import com.test.aop.TestA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTest {

    @Autowired
    private  TestA testA;


    public void test1(){
        System.out.println("...");
        System.out.println(testA.toString());
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
