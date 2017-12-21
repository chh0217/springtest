package my.ch.spring.kt.chapter4;

import my.ch.spring.kt.chapter4.bean.ResourceBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @author chenh
 * @date 2017/12/21.
 */
public class ResoureLoaderAwareTest {
    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("kt/chapter4/resourceLoaderAware.xml");
        ResourceBean resourceBean = ctx.getBean(ResourceBean.class);
        ResourceLoader loader = resourceBean.getResourceLoader();
        Assert.assertTrue(loader instanceof ApplicationContext);
    }
}
