package my.ch.spring;

import my.ch.spring.event.hello.TestClass;

/**
 * Created by chenh on 2017/8/16.
 */
public class MyTest {
    public static void main(String args[]) {
        int num = 2147483647 ;
        long temp = num + 2L ;
        System.out.println(num) ;


        for(int i=0;i < 20;i++){
            new TestClass().ppp();
        }
    }
}
