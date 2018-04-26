package com.zstu.manage.controller;

import com.zstu.manage.service.StudentCourseService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentCoursesController {

    @Resource
    private StudentCourseService studentCourseService;

    @RequestMapping(value = "/addStuCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg addStuCour(){

        return null;
    }

    @RequestMapping(value = "/getByStuId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByStuId(Integer studentid){
        List list = studentCourseService.getByStudentId(studentid);
        if(list != null){
            return Msg.success().add("lust",list);
        }
        return Msg.fail();
    }

}
