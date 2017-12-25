package my.ch.spring.kt.chapter6.service.impl;

import my.ch.spring.kt.chapter6.service.IHelloWorldService;

/**
 * @author chenh
 * @date 2017/12/25.
 */
public class HelloWorldService implements IHelloWorldService{
    @Override
    public void sayHello() {
        System.out.println("============Hello World!");
    }
}
