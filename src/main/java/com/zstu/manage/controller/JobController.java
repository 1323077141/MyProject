package com.zstu.manage.controller;

import com.zstu.manage.bean.Job;
import com.zstu.manage.service.JobService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JobController {
    @Resource
    private JobService jobService;

    @RequestMapping(value = "/getAllJob")
    @ResponseBody
    public Msg getAll(){
        List<Job> list = jobService.getAll();
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/getJobByName",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByName(Job job){
        List<Job> list = jobService.getByName(job);
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/getJobByEnterprise")
    @ResponseBody
    public Msg getByEnterprise(HttpSession session){
        Integer enterpriseId = (Integer) session.getAttribute("enterpriseId");
        Job job = new Job(enterpriseId);
        List<Job> list = jobService.getByEnterprise(job);
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/updateJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Job job){
        if(jobService.update(job)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/deleteJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg delete(Integer id){
        if(jobService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/addJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Job job){
        if(jobService.insert(job)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

}
