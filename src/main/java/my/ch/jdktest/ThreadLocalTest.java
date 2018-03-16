package my.ch.jdktest;

/**
 * @author chenhang
 * @date 2018-03-15.
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<Integer> local = new ThreadLocal<>();
        local.set(1);
        local.set(2);
    }
}
