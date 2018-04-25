package com.zstu.manage.controller;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.service.ResumeJobService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/addResumeJob")
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



}
