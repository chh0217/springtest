package my.ch.spring.kt.chapter6;

import my.ch.spring.kt.chapter6.service.IHelloWorldService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenh
 * @date 2017/12/25.
 */
public class AopTest {
    @Test
    public void testHelloworld() {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("kt/chapter6/helloworld.xml");
        IHelloWorldService helloworldService =
                ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloworldService.sayHello();
    }
}
