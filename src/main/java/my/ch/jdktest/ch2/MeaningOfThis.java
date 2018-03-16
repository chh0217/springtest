package my.ch.jdktest.ch2;

/**
 * @author chenhang
 * @date 2018/2/26.
 */
public class MeaningOfThis {
    public final int value = 4;
    public void doIt()
    {
        int value = 6;
        Runnable r = new Runnable(){
            public final int value = 5;
            public void run(){
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }
    public static void main(String...args)
    {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt(); // ???
    }
}
