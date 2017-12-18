package my.ch.spring.kt.chapter3;

import my.ch.spring.kt.chapter2.HelloApi;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class HelloImpl4 implements HelloApi {
    private String message;
    private int index;
    //setter方法
    public void setMessage(String message) {
        this.message = message;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
