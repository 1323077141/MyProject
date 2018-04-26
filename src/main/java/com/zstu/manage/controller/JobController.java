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

    /**
     * 获取所有职位
     * @return
     */
    @RequestMapping(value = "/getAllJob")
    @ResponseBody
    public Msg getAll(){
        List<Job> list = jobService.getAll();
        return Msg.success().add("list",list);
    }

    /**
     * 根据工作名模糊查询职位
     * @param job
     * @return
     */
    @RequestMapping(value = "/getJobByName",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByName(Job job){
        List<Job> list = jobService.getByName(job);
        return Msg.success().add("list",list);
    }

    /**
     * 获取该企业的招聘岗位
     * @param enterpriseid
     * @return
     */
    @RequestMapping(value = "/getJobByEnterprise")
    @ResponseBody
    public Msg getByEnterprise(Integer enterpriseid){
//        Integer enterpriseId = (Integer) session.getAttribute("enterpriseId");
        Job job = new Job(enterpriseid);
        List<Job> list = jobService.getByEnterprise(job);
        return Msg.success().add("list",list);
    }

    /**
     * 更新工作信息
     * @param job
     * @return
     */
    @RequestMapping(value = "/updateJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Job job){
        if(jobService.update(job)){
            return Msg.success().add("job",job);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 根据ID删除职位
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg delete(Integer id){
        if(jobService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    /**
     * 增加工作
     * @param job
     * @return
     */
    @RequestMapping(value = "/addJob",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Job job){
        //从httpsession中添加企业信息
        if(jobService.insert(job)){
            return Msg.success().add("job",job);
        }else{
            return Msg.fail();
        }
    }

}
