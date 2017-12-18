package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;

/**
 * 实例工厂类
 * @author chenh
 * @date 2017/12/18.
 */
public class DependencyInjectByInstanceFactory {
    public HelloApi newInstance(String message, int index) {
        return new HelloImpl3(message, index);
    }
}
