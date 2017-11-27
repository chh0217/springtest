package my.ch.spring.aop.myaop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chenh on 2017/11/21.
 */
public class MyHandler implements InvocationHandler{

    private Object target;

    MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置");
        Object o = method.invoke(target,args);
        System.out.println("后置");
        return o;
    }
}
