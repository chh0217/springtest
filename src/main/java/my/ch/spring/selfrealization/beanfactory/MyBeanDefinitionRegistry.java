package my.ch.spring.selfrealization.beanfactory;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenh
 * @date 2017/12/29.
 */
public class MyBeanDefinitionRegistry implements BeanDefinitionRegistry {

    private final Map<String,BeanDefinition> MAP = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException {
        MAP.put(beanName,beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        MAP.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        return MAP.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return false;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return MAP.keySet().toArray(new String[0]);
    }

    @Override
    public int getBeanDefinitionCount() {
        return MAP.size();
    }

    @Override
    public boolean isBeanNameInUse(String beanName) {
        return false;
    }

    @Override
    public void registerAlias(String name, String alias) {

    }

    @Override
    public void removeAlias(String alias) {

    }

    @Override
    public boolean isAlias(String name) {
        return false;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }
}
