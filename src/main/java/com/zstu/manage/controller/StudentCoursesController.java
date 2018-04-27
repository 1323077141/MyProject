package com.zstu.manage.controller;

import com.zstu.manage.service.StudentCourseService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

@Controller
public class StudentCoursesController {

    @Resource
    private StudentCourseService studentCourseService;


    /**
     * 导入学生成绩
     * @return
     */
    @RequestMapping(value = "/addStuCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg addStuCour(@RequestParam(value="upfile",required=false)MultipartFile file) throws Exception{
        InputStream in = file.getInputStream();
        studentCourseService.importFile(in,file);
        in.close();
        return Msg.success();
    }

    /**
     * 获取所有学生的成绩信息
     * @return
     */
    @RequestMapping(value = "/getAllStuCour",method = RequestMethod.POST)
    @ResponseBody
    public Msg getAll(){
        return Msg.success().add("item",studentCourseService.getAll());
    }


    /**
     * 查看学生的课程成绩
     * @param studentid
     * @return
     */
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
