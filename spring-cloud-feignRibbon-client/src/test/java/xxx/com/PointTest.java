package xxx.com;


import com.sspring.netfix.study.feign.NacosClientApplication;
import com.sspring.netfix.study.feign.point.demo1.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NacosClientApplication.class)
public class PointTest {

    @Autowired
    private  UserTest userTest;

    @Test
    public  void test1 (){

        System.out.println(userTest);

    }

}
