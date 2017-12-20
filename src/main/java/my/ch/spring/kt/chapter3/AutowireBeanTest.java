package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author chenh
 * @date 2017/12/20.
 */
public class AutowireBeanTest {
    @Test
    public void testAutowireByName() throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("kt/chapter3/autowire-byName.xml");
        HelloApi helloApi = context.getBean("bean", HelloApi.class);
        helloApi.sayHello();
    }
}
