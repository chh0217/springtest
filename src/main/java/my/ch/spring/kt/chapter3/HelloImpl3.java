package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class HelloImpl3 implements HelloApi {
    private String message;
    private int index;

//    @java.beans.ConstructorProperties({"message", "index"})
    public HelloImpl3(String message, int index) {
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
