package com.zstu.manage.bean;

public class ResumeJob {
    private Integer id;

    private Integer resumeid;

    private Integer jobid;

    private String jobname;

    private Integer studentid;

    private String studentnumber;

    private Integer firststate;

    private Integer firstlook;

    private Integer secondinvite;

    private Integer secondstate;

    private Integer finalstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public Integer getFirststate() {
        return firststate;
    }

    public void setFirststate(Integer firststate) {
        this.firststate = firststate;
    }

    public Integer getFirstlook() {
        return firstlook;
    }

    public void setFirstlook(Integer firstlook) {
        this.firstlook = firstlook;
    }

    public Integer getSecondinvite() {
        return secondinvite;
    }

    public void setSecondinvite(Integer secondinvite) {
        this.secondinvite = secondinvite;
    }

    public Integer getSecondstate() {
        return secondstate;
    }

    public void setSecondstate(Integer secondstate) {
        this.secondstate = secondstate;
    }

    public Integer getFinalstate() {
        return finalstate;
    }

    public void setFinalstate(Integer finalstate) {
        this.finalstate = finalstate;
    }
}