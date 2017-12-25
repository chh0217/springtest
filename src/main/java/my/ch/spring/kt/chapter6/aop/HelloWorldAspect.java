package my.ch.spring.kt.chapter6.aop;

/**
 * @author chenh
 * @date 2017/12/25.
 */
public class HelloWorldAspect {
    //前置通知
    public void beforeAdvice() {
        System.out.println("===========before advice");
    }
    //后置最终通知
    public void afterFinallyAdvice() {
        System.out.println("===========after finally advice");
    }
}
