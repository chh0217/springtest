package event;

import my.ch.spring.event.hello.ContentEvent;
import my.ch.spring.event.hello.ZhangsanListener;
import my.ch.spring.event.register.RegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.ResolvableType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenh on 2017/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class EventTest {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private RegisterService registerService;

    @Test
    public void testPublishEvent() {
        applicationContext.publishEvent(new ContentEvent("20171009"));
        System.out.println("1231231231231");
        ResolvableType resolvableType1 = ResolvableType.forClass(ZhangsanListener.class);
        System.out.println(resolvableType1.as(ApplicationListener.class).getGeneric(0).resolve());
        System.out.println(resolvableType1.as(ApplicationListener.class).getGeneric(0).resolve().toGenericString());
    }

    @Test
    public void testRegister() {
        registerService.register("long", "123");
    }
}
