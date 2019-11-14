import cd.shuhan.springStarterTest.service.HelloService;
import cn.shuhan.myStarterTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = myStarterTest.class) //表明测试的启动类
public class MyTest {

    @Autowired
    HelloService helloService;

    @Test
    public void test(){
        System.out.println(helloService.say()); //运行结果zhangsansayjava
    }
}
