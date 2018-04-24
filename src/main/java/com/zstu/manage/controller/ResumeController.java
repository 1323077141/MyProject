package com.zstu.manage.controller;

import com.zstu.manage.bean.Resume;
import com.zstu.manage.service.ResumeService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
@Controller
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @RequestMapping("/getResumeByStudentId")
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
        Integer StudentId = (Integer) session.getAttribute("studentId");
        List<Resume> list = resumeService.getByStudentId(StudentId);
        return Msg.success().add("list",list);
    }

    @RequestMapping("/getResumeById")
    @ResponseBody
    public Msg getById(Integer id){
        Resume resume = resumeService.getByResumeId(id);
        if(resume != null){
            return Msg.success().add("resume",resume);
        }
        return Msg.fail();
    }

    @RequestMapping(value = "/addResume",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Resume resume){
        if(resumeService.add(resume)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/deleteResume")
    @ResponseBody
    public Msg delete(Integer id){
        if(resumeService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/updateResume",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Resume resume){
        if(resumeService.update(resume)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

}
