package my.ch.spring.kt.chapter3.bean;

import java.util.Collection;

/**
 * @author chenh
 * @date 2017/12/18.
 */
public class SetTestBean {
    private Collection<String> values;
    public void setValues(Collection<String> values) {
        this.values = values;
    }
    public Collection<String> getValues() {
        return values;
    }
}
