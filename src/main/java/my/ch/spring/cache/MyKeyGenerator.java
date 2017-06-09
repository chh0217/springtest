package my.ch.spring.cache;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKey;

import java.lang.reflect.Method;

/**
 * Created by chenh on 2017/6/9.
 */
public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        if(params.length == 0){
            System.out.println("key1   "+target.getClass().getName()+":"+ SimpleKey.EMPTY);
            return target.getClass().getName()+":"+ SimpleKey.EMPTY;
        }
        System.out.println("key2   "+target.getClass().getName()+":"+params[0]);
        return target.getClass().getName()+":"+params[0];
    }
}
