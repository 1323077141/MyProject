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

@Controller("/job")
public class JobController {
    @Resource
    private JobService jobService;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public Msg getAll(){
        List<Job> list = jobService.getAll();
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/getByName",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByName(Job job){
        List<Job> list = jobService.getByName(job);
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/getByEnterprise")
    @ResponseBody
    public Msg getByEnterprise(HttpSession session){
        Integer enterpriseId = (Integer) session.getAttribute("enterpriseId");
        Job job = new Job(enterpriseId);
        List<Job> list = jobService.getByEnterprise(job);
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Job job){
        if(jobService.update(job)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public Msg delete(Integer id){
        if(jobService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Job job){
        if(jobService.insert(job)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

}
