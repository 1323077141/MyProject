package com.zstu.manage.controller;

import com.zstu.manage.bean.Job;
import com.zstu.manage.service.JobService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class JobController {
    @Resource
    private JobService jobService;

    @RequestMapping("/getAll")
    @ResponseBody
    public Msg getAll(){
        List<Job> list = jobService.getAll();
        return Msg.success().add("list",list);
    }

    @RequestMapping("/selectByName")
    @ResponseBody
    public Msg getByName(Job job){

        return Msg.fail();
    }

}
