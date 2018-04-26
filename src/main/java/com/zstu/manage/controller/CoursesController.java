package com.zstu.manage.controller;

import com.zstu.manage.bean.Courses;
import com.zstu.manage.service.CoursesService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CoursesController {
    @Resource
    CoursesService coursesService;

    /**
     * 增加课程信息
     * @param courses
     * @return
     */
    @RequestMapping(value = "/addCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(Courses courses){
        if(coursesService.insert(courses)){
            return Msg.success().add("courses",courses);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 获取课程信息
     * @return
     */
    @RequestMapping(value = "/getAllCourse",method = RequestMethod.POST)
    @ResponseBody
    public Msg getAll(){
        return Msg.success().add("list",coursesService.getAll());
    }

    /**
     * 更新课程信息
     * @param courses
     * @return
     */
    @RequestMapping(value = "/updateCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateCour(Courses courses){
        if(coursesService.update(courses)){
            return Msg.success().add("courses",courses);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 删除课程信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg deleteCour(Integer id){
        if(coursesService.delete(id)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

}
