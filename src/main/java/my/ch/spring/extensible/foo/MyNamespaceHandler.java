package my.ch.spring.extensible.foo;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by chenh on 2017/11/1.
 */
public class MyNamespaceHandler  extends NamespaceHandlerSupport{
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
