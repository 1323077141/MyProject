package com.zstu.manage.controller;

import com.zstu.manage.bean.Student;
import com.zstu.manage.service.StudentService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 登录
     * @param record
     * @param session
     * @return
     */
    @RequestMapping(value = "/loginStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(Student record, HttpSession session){
        Student student = studentService.getByStudentNumber(record);
        if(student != null){
            if(student.getPassword().equals(record.getPassword())){
                session.setAttribute("studentid",student.getId());
                session.setAttribute("studentnumber",student.getStudentnumber());
                return Msg.success().add("student",student);
            }
        }
        return Msg.fail();
    }

    /**
     * 更新学生个人信息
     * @param student
     * @return
     */
    @RequestMapping(value = "/updateStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateStu(Student student){
        if(studentService.update(student)){
            return Msg.success().add("student",studentService.getById(student.getId()));
        }else{
            return Msg.fail();
        }
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/addStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg addStu(){

        return null;
    }
}
