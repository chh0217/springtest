package my.ch.spring.kt.chapter3.bean;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class CircleA {
    private CircleB circleB;
    public CircleA() {
    }
    public CircleA(CircleB circleB) {
        this.circleB = circleB;
    }
    public void setCircleB(CircleB circleB)
    {
        this.circleB = circleB;
    }
    public void a() {
        circleB.b();
    }
}
