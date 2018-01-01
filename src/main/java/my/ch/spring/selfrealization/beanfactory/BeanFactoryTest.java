package my.ch.spring.selfrealization.beanfactory;

import my.ch.spring.kt.chapter2.HelloImpl2;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author chenh
 * @date 2017/12/29.
 */
public class BeanFactoryTest {
    @Test
    public void factoryTest(){
        //先创建bean工厂
        MyBeanFacotry myBeanFactory = new MyBeanFacotry();
        MyBeanDefinition myBeanDefinition = new MyBeanDefinition(HelloImpl2.class);
        myBeanDefinition.setBeanClassName("hello");
        myBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        myBeanFactory.registerBeanDefinition(myBeanDefinition);
        HelloImpl2 h = (HelloImpl2)myBeanFactory.getBean("hello");
        h.sayHello();

         HelloImpl2 h2 = (HelloImpl2)myBeanFactory.getBean("hello");
        System.out.println(h == h2);
    }

    @Test
    public void factoryPrototyteTest(){
        //先创建bean工厂
        MyBeanFacotry myBeanFactory = new MyBeanFacotry();
        MyBeanDefinition myBeanDefinition = new MyBeanDefinition(HelloImpl2.class);
        myBeanDefinition.setBeanClassName("hello");
        myBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        myBeanFactory.registerBeanDefinition(myBeanDefinition);
        HelloImpl2 h = (HelloImpl2)myBeanFactory.getBean("hello");
        h.sayHello();

        HelloImpl2 h2 = (HelloImpl2)myBeanFactory.getBean("hello");
        System.out.println(h == h2);
    }
}
