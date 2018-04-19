package com.zstu.manage.bean;

public class Job {
    private Integer id;

    private String jobname;

    private Integer jobnumber;

    private String jobdescribe;

    private String jobrequire;

    private Integer enterpriseid;

    private String enterprisename;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Integer getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(Integer jobnumber) {
        this.jobnumber = jobnumber;
    }

    public String getJobdescribe() {
        return jobdescribe;
    }

    public void setJobdescribe(String jobdescribe) {
        this.jobdescribe = jobdescribe == null ? null : jobdescribe.trim();
    }

    public String getJobrequire() {
        return jobrequire;
    }

    public void setJobrequire(String jobrequire) {
        this.jobrequire = jobrequire == null ? null : jobrequire.trim();
    }

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}