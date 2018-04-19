package com.zstu.manage.bean;

public class Enterprise {
    private Integer id;

    private String enterprisenumber;

    private String password;

    private Integer state;

    private String describe;

    private String enterprisename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterprisenumber() {
        return enterprisenumber;
    }

    public void setEnterprisenumber(String enterprisenumber) {
        this.enterprisenumber = enterprisenumber == null ? null : enterprisenumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }
}