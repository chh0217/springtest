package my.ch.spring.selfrealization.beanfactory;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;

/**
 * @author chenh
 * @date 2017/12/29.
 */
public class MyBeanDefinition implements BeanDefinition{

    private String beanClassName;

    private String scope;

    private Class<?> beanClass;

    public MyBeanDefinition(Class<?> beanClass){
        this.beanClass = beanClass;
    }

    @Override
    public void setParentName(String parentName) {

    }

    @Override
    public String getParentName() {
        return null;
    }

    @Override
    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return beanClassName;
    }

    @Override
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public void setLazyInit(boolean lazyInit) {

    }

    @Override
    public boolean isLazyInit() {
        return false;
    }

    @Override
    public void setDependsOn(String... dependsOn) {

    }

    @Override
    public String[] getDependsOn() {
        return new String[0];
    }

    @Override
    public void setAutowireCandidate(boolean autowireCandidate) {

    }

    @Override
    public boolean isAutowireCandidate() {
        return false;
    }

    @Override
    public void setPrimary(boolean primary) {

    }

    @Override
    public boolean isPrimary() {
        return false;
    }

    @Override
    public void setFactoryBeanName(String factoryBeanName) {

    }

    @Override
    public String getFactoryBeanName() {
        return null;
    }

    @Override
    public void setFactoryMethodName(String factoryMethodName) {

    }

    @Override
    public String getFactoryMethodName() {
        return null;
    }

    @Override
    public ConstructorArgumentValues getConstructorArgumentValues() {
        return null;
    }

    @Override
    public MutablePropertyValues getPropertyValues() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public boolean isPrototype() {
        return false;
    }

    @Override
    public boolean isAbstract() {
        return false;
    }

    @Override
    public int getRole() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getResourceDescription() {
        return null;
    }

    @Override
    public BeanDefinition getOriginatingBeanDefinition() {
        return null;
    }

    @Override
    public Object getSource() {
        return null;
    }

    @Override
    public void setAttribute(String name, Object value) {

    }

    @Override
    public Object getAttribute(String name) {
        return null;
    }

    @Override
    public Object removeAttribute(String name) {
        return null;
    }

    @Override
    public boolean hasAttribute(String name) {
        return false;
    }

    @Override
    public String[] attributeNames() {
        return new String[0];
    }
}
