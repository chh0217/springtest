package my.ch.spring.kt.chapter2;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author chenhang
 * @date 2018/2/12.
 */
public class HelloFactoryBean implements FactoryBean<HelloBean> {

    private String name;

    private String word;

    private HelloBean helloBean;

    @Override
    public HelloBean getObject() throws Exception {
        if(null == helloBean){
            helloBean = new HelloBean();
            helloBean.setName(name);
            helloBean.setWord(word);
        }
        return helloBean;
    }

    @Override
    public Class<?> getObjectType() {
        return HelloBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
