package my.ch.spring.aop.myaop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chenh on 2017/11/21.
 */
public class MyHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置");
        method.invoke(args);
        System.out.println("后置");
        return null;
    }
}
