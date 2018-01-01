package my.ch.spring.selfrealization.beanfactory;

import my.ch.spring.kt.chapter3.BeanDefinition;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenh
 * @date 2017/12/29.
 */
public class MyBeanFacotry implements BeanFactory {

    private final Map<String,MyBeanDefinition> beanDefinitionMap = new HashMap<>();

    private final MySingletonBeanRegistry singletonBeanRegistry = new MySingletonBeanRegistry();

    @Override
    public Object getBean(String name) throws BeansException {

         if(!beanDefinitionMap.containsKey(name)){
            throw new RuntimeException("不存在[" + name + "]Bean定义");
        }
        MyBeanDefinition de = beanDefinitionMap.get(name);
        //如果是单例
        if(BeanDefinition.SCOPE_SINGLETON == de.getScope()){
             //不存在
            if(!singletonBeanRegistry.containsSingleton(name)){
                singletonBeanRegistry.registerSingleton(name,create(de));
            }
            //如果存在 直接返回
            return singletonBeanRegistry.getSingleton(name);
        }
        //多例
        return create(de);
    }

    private Object create(MyBeanDefinition definition){
        try {
            return definition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void registerBeanDefinition(MyBeanDefinition myBeanDefinition) throws RuntimeException{
        if(null == myBeanDefinition){
            throw new RuntimeException("没有MyBeanDefinition");
        }
        beanDefinitionMap.put(myBeanDefinition.getBeanClassName(),myBeanDefinition);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }
}
