package my.ch.spring.kt.chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class CircleTest {
    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable {
        try {
            new ClassPathXmlApplicationContext("kt/chapter3/circleInjectByConstructor.xml");
        }
        catch (Exception e) {
            //因为要在创建circle3时抛出；
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    //测试代码cn.javass.spring.chapter3.CircleTest
    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleBySetterAndPrototype () throws Throwable {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                    "kt/chapter3/circleInjectBySetterAndPrototype.xml");
            System.out.println(ctx.getBean("circleA"));
        }
        catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
