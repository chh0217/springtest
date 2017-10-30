package my.ch.spring.cache.domain;

import java.io.Serializable;

/**
 * Created by chenh on 2017/6/5.
 */
public class User implements Serializable{
    private Long id;
    private String name;
    private String mobile;
    private String address;

    public User(){}

    public User(Long id,String name,String mobile,String address){
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
