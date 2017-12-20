package my.ch.spring.kt.chapter3.bean;

/**
 * @author chenh
 * @date 2017/12/20.
 */
public class Printer {
    private int counter = 0;
    public void print(String type) {
        System.out.println(type + " printer: " + counter++);
    }
}
