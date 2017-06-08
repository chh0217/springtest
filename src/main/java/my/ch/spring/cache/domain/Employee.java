package my.ch.spring.cache.domain;

import java.util.Date;

/**
 * 员工
 */
public class Employee{

    private Long id;
    private Integer bid;//组织机构号
    private String name;//姓名
    private Long mobile;//手机号码
    private String password;//登录密码
    private String salt;// 加密盐数据
    private Integer stcode;//用户状态，0：锁定 1：正常 2：关闭
    private int failnums;//失败登录次数
    private Date lastTime;//最近登录时间
    private String telephone;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStcode() {
        return stcode;
    }

    public void setStcode(Integer stcode) {
        this.stcode = stcode;
    }

    public int getFailnums() {
        return failnums;
    }

    public void setFailnums(int failnums) {
        this.failnums = failnums;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
