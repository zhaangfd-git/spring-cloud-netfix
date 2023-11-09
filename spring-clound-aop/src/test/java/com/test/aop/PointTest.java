package com.test.aop;



import com.test.aop.demo.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClientApplication.class)
public class PointTest {

    @Autowired
    private UserTest userTest;

    @Test
    public  void test1 (){

       userTest.test1();

    }

}
