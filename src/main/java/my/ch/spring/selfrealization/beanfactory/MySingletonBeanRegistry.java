package my.ch.spring.selfrealization.beanfactory;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenh
 * @date 2017/12/29.
 */
public class MySingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 不考虑并发情况
     */
    private final Map<String, Object> BEAN_MAP = new HashMap<>();

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        BEAN_MAP.put(beanName,singletonObject);
    }

    @Override
    public Object getSingleton(String beanName) {
        return BEAN_MAP.get(beanName);
    }

    @Override
    public boolean containsSingleton(String beanName) {
        return false;
    }

    @Override
    public String[] getSingletonNames() {
        return BEAN_MAP.keySet().toArray(new String[0]);
    }

    @Override
    public int getSingletonCount() {
        return BEAN_MAP.size();
    }

    @Override
    public Object getSingletonMutex() {
        return null;
    }
}
