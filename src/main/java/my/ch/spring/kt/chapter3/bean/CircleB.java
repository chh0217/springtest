package my.ch.spring.kt.chapter3.bean;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class CircleB {
    private CircleC circleC;
    public CircleB() {
    }
    public CircleB(CircleC circleC) {
        this.circleC = circleC;
    }
    public void setCircleC(CircleC circleC)
    {
        this.circleC = circleC;
    }
    public void b() {
        circleC.c();
    }
}
