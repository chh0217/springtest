package my.ch.spring.kt.chapter3.bean;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class CircleC {
    private CircleA circleA;
    public CircleC() {
    }
    public CircleC(CircleA circleA) {
        this.circleA = circleA;
    }
    public void setCircleA(CircleA circleA)
    {
        this.circleA = circleA;
    }
    public void c() {
        circleA.a();
    }
}
