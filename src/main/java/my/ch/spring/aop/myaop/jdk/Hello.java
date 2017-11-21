package my.ch.spring.aop.myaop.jdk;

/**
 * Created by chenh on 2017/11/21.
 */
public class Hello implements HelloApi{
    public void sayHello(){
        System.out.println("say-hello");
    }
    public void sayHello(String a){
        System.out.println("say-hello"+"-"+a);
    }
}
