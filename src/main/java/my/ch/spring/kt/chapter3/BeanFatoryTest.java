package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloImpl2;
import org.junit.Test;

/**
 * Bean的作用域
 * @author chenh
 * @date 2017/12/20.
 */
public class BeanFatoryTest {
    @Test
    public void testPrototype () throws Exception {
        //1.创建Bean工厂
        DefaultBeanFactory bf = new DefaultBeanFactory();
        //2.创建原型 Bean定义
        BeanDefinition bd = new BeanDefinition();
        bd.setId("bean");
        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        bd.setClazz(HelloImpl2.class.getName());
        bf.registerBeanDefinition(bd);
        //对于原型Bean每次应该返回一个全新的Bean
        System.out.println(bf.getBean("bean") != bf.getBean("bean"));
    }
}
