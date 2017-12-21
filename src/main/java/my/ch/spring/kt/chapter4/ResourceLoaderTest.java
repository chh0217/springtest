package my.ch.spring.kt.chapter4;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.*;

/**
 * @author chenh
 * @date 2017/12/21.
 */
public class ResourceLoaderTest {
    @Test
    public void testResourceLoad() {
        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:cn/javass/spring/chapter4/test1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(ClassPathResource.class, resource.getClass());
        Resource resource2 = loader.getResource("file:cn/javass/spring/chapter4/test1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(UrlResource.class, resource2.getClass());
        Resource resource3 = loader.getResource("cn/javass/spring/chapter4/test1.txt");
        //验证返默认可以加载ClasspathResource
        Assert.assertTrue(resource3 instanceof ClassPathResource);
    }
}
