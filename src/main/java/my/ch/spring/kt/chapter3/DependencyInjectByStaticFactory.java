package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;

/**
 * 静态工厂类
 * @author chenh
 * @date 2017/12/18.
 */
public class DependencyInjectByStaticFactory {
    public static HelloApi newInstance(String message, int index) {
        return new HelloImpl3(message, index);
    }
}
