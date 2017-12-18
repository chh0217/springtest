package my.ch.spring.kt.chapter2;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class HelloImpl2 implements HelloApi {
    private String message;

    public HelloImpl2() {
        this.message = "Hello World!";
    }

    public HelloImpl2(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println(message);
    }
}
