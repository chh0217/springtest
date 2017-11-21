package my.ch.spring.aop.myaop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by chenh on 2017/11/21.
 */
public class Test {
    public static void main(String[] args) {
        InvocationHandler handler = new MyHandler();
        HelloApi hello = (HelloApi)Proxy.newProxyInstance(Hello.class.getClassLoader(),Hello.class.getInterfaces(),handler);
        hello.sayHello();
    }
}
