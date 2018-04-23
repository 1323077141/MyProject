package com.zstu.manage.controller;

import com.zstu.manage.bean.EnterpriseStudent;
import com.zstu.manage.service.EnterpriseStudentService;
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
@Controller("/enterpriseStudent")
public class EnterpriseStudentController {

    @Resource
    private EnterpriseStudentService enterpriseStudentService;

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(EnterpriseStudent record){
        if(enterpriseStudentService.update(record)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Msg getAll(){
        List<EnterpriseStudent> list = enterpriseStudentService.getAll();
        return Msg.success().add("list",list);
    }

    @RequestMapping("/getByStudentId")
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
        Integer studentId = (Integer) session.getAttribute("studentId");
        List<EnterpriseStudent> list = enterpriseStudentService.getByStudentId(studentId);
        return Msg.success().add("list",list);
    }



}