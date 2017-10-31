package my.ch.spring.extensible.foo;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by chenh on 2017/10/31.
 */
public class ComponentNamespaceHandler extends NamespaceHandlerSupport{
    @Override
    public void init() {
        registerBeanDefinitionParser("component", new ComponentBeanDefinitionParser());
    }
}
