package com.zstu.manage.controller;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.service.ResumeJobService;
import com.zstu.manage.util.Msg;
import com.zstu.manage.vo.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018-04-23.
 */
@Controller
public class ResumeJobController {
    @Resource
    ResumeJobService resumeJobService;

    /**
     * 学生投递简历
     * @param record
     * @return
     */
    @RequestMapping(value = "/addResumeJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg addByStudent(ResumeJob record){
//        record.setStudentid((Integer) session.getAttribute("studentId"));
//        record.setStudentnumber((String) session.getAttribute("studentNumber"));
        if(resumeJobService.add(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 更新简历信息(浏览状态，初试筛选，面试邀约，面试状态，接收工作与否)
     * @param record
     * @return
     */
    @RequestMapping(value = "/updateResumeJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateById(ResumeJob record){
        if(resumeJobService.update(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 学生查看找寻工作状态
     * @param session
     * @return
     */
    @RequestMapping(value = "/getByStudentId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
            Integer studentid = (Integer)session.getAttribute("studentid");
        return Msg.success().add("list",resumeJobService.getByStudentId(studentid));
    }

    /**
     * 企业查看投递的简历信息
     * @param session
     * @return
     */
    @RequestMapping(value = "/getByEnterpriseId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByEnterpriseId(HttpSession session){
        Integer enterpriseid = (Integer) session.getAttribute("enterpriseid");
        return Msg.success().add("list",resumeJobService.getByEnterpriseId(enterpriseid));
    }

    /**
     * 获取所有投递的简历信息
     * @return
     */
    @RequestMapping(value = "/getAllResumeJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg getAll(){
        return Msg.success().add("list",resumeJobService.getAll());
    }

    /**
     * 企业查询特定职位所投递的简历
     * @param jobname
     * @param session
     * @return
     */
    @RequestMapping(value = "/getByNameAndEnterprise",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByNmaeAndEnterprise(String jobname,HttpSession session){
        Integer enterpriseid = (Integer) session.getAttribute("enterpriseid");
        Param param = new Param(enterpriseid,jobname);
        return Msg.success().add("list",resumeJobService.getByJobNameAndEnterprise(param));
    }



}
