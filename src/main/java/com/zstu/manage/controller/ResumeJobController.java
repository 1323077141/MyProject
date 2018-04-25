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
     *
     * @param record
     * @param session
     * @return
     */
    @RequestMapping(value = "/addResumeJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg addByStudent(ResumeJob record,HttpSession session){
        record.setStudentid((Integer) session.getAttribute("studentId"));
        record.setStudentnumber((String) session.getAttribute("studentNumber"));
        if(resumeJobService.add(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/updateResumeJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateById(ResumeJob record){
        if(resumeJobService.update(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/getByStudentId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
        return Msg.success().add("list",resumeJobService.getByStudentId((Integer) session.getAttribute("studentId")));
    }


    @RequestMapping(value = "/getByEnterpriseId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByEnterpriseId(HttpSession session){
        return Msg.success().add("list",resumeJobService.getByEnterpriseId((Integer) session.getAttribute("enterpriseId")));
    }

    @RequestMapping(value = "/getAllResumeJob")
    @ResponseBody
    public Msg getAll(){
        return Msg.success().add("list",resumeJobService.getAll());
    }

    @RequestMapping(value = "/getByNameAndEnterprise",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByNmaeAndEnterprise(String jobname,HttpSession session){
        Param param = new Param((Integer)session.getAttribute("enterpriseId"),jobname);
        return Msg.success().add("list",resumeJobService.getByJobNameAndEnterprise(param));
    }



}
