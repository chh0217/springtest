package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;
import my.ch.spring.kt.chapter3.bean.ListTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class DependencyInjectTest {
    @Test
    public void testConstructorDependencyInjectTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("kt/chapter3/constructorDependencyInject.xml");
        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();
        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();
        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public void testDependencyInjectByInstanceFactoryTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("kt/chapter3/instanceFactoryDependencyInject.xml");
        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();
        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();
        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public void testDependencyInjectByStaticFactoryTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("kt/chapter3/staticFactoryDependencyInject.xml");
        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();
        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();
        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public void testSetterDependencyInject() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("kt/chapter3/setterDependencyInject.xml");
        HelloApi bean = beanFactory.getBean("bean", HelloApi.class);
        bean.sayHello();
    }

    @Test
    public void testListInject() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("kt/chapter3/listInject.xml");
        ListTestBean listBean = beanFactory.getBean("listBean", ListTestBean.class);
        System.out.println(listBean.getValues().size());
        Assert.assertEquals(3, listBean.getValues().size());
    }

    @Test
    public void testBeanInject() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("kt/chapter3/beanInject.xml");
        //通过构造器方式注入
        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        //通过setter方式注入
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }
}
