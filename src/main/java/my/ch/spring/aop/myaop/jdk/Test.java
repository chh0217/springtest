package my.ch.spring.aop.myaop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by chenh on 2017/11/21.
 */
public class Test {
    public static void main(String[] args) {
        HelloApi h = new Hello();
        InvocationHandler handler = new MyHandler(h);
        HelloApi hello = (HelloApi)Proxy.newProxyInstance(h.getClass().getClassLoader(),Hello.class.getInterfaces(),handler);
        hello.sayHello("asdf");
        hello.sayHello();
    }
}
