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

    /**
     * 学生查询自己的简历信息
     * @param session
     * @return
     */
    @RequestMapping(value = "/getResumeByStudentId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
        Integer studentid = (Integer) session.getAttribute("studentid");
        List<Resume> list = resumeService.getByStudentId(studentid);
        return Msg.success().add("list",list);
    }

    /**
     * 根据ID获取简历信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getResumeById",method = RequestMethod.POST)
    @ResponseBody
    public Msg getById(Integer id){
        Resume resume = resumeService.getByResumeId(id);
        if(resume != null){
            return Msg.success().add("resume",resume);
        }
        return Msg.fail();
    }

    /**
     * 增加简历信息
     * @param resume
     * @return
     */
    @RequestMapping(value = "/addResume",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Resume resume){
        if(resumeService.add(resume)){
            return Msg.success().add("record",resume);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 删除简历信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteResume",method = RequestMethod.POST)
    @ResponseBody
    public Msg delete(Integer id){
        if(resumeService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    /**
     * 更新简历
     * @param resume
     * @return
     */
    @RequestMapping(value = "/updateResume",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Resume resume){
        if(resumeService.update(resume)){
            return Msg.success().add("resume",resumeService.getByResumeId(resume.getId()));
        }else{
            return Msg.fail();
        }
    }

}
