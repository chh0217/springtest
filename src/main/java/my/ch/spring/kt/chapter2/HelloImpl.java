package my.ch.spring.kt.chapter2;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class HelloImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
