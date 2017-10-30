package my.ch.spring.cache.domain;

import java.io.Serializable;

/**
 * Created by chenh on 2017/6/16.
 */
public class Dog  implements Serializable {
    private Integer id;
    private String name;

    public Dog(){}

    public Dog(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
