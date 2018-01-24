package my.ch.spring.selfrealization.beanfactory;

import my.ch.spring.kt.chapter2.HelloApi;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenh
 * @date 2018/1/12.
 */
public class BeanFactoyTest {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("ch/beanfactory/beanfactory1.xml");
//        HelloApi helloApi = bf.getBean(HelloApi.class);
        HelloApi helloApi1 = (HelloApi)bf.getBean("hello");
        helloApi1.sayHello();
    }
}
