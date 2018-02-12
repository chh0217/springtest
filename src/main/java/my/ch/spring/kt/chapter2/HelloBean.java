package my.ch.spring.kt.chapter2;

/**
 * @author chenhang
 * @date 2018/2/12.
 */
public class HelloBean {
    private String word;
    private String name;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println(name+":"+word);
    }
}
