package my.ch.spring.kt.chapter2;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class InstantiatingContainerTest {
    @Test
    public void testInstantiatingBeanByConstructor() {
        //使用构造器
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("kt/chapter2/instantiatingBean.xml");
        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }
}
