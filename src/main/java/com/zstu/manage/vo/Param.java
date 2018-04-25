package com.zstu.manage.vo;

public class Param {

    private Integer enterpriseId;

    private String jobname;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public Param(){

    }

    public Param(Integer enterpriseId,String jobname){
        this.enterpriseId = enterpriseId;
        this.jobname = jobname;
    }

}
