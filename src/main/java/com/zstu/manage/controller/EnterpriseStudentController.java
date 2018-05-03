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
@Controller
public class EnterpriseStudentController {

    @Resource
    private EnterpriseStudentService enterpriseStudentService;

    /**
     * 审核状态
     * @param record
     * @return
     */
    @RequestMapping(value = "/updateEnterStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(EnterpriseStudent record){
        if(enterpriseStudentService.update(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 学生增加签约方
     * @param record
     * @return
     */
    @RequestMapping(value = "/addEnterStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(EnterpriseStudent record){
        if(enterpriseStudentService.insert(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    /**
     * 获取所有待签约列表
     * @return
     */
    @RequestMapping(value = "/getAllEnterStu",method = RequestMethod.POST)
    @ResponseBody
    public Msg getAll(){
        List<EnterpriseStudent> list = enterpriseStudentService.getAll();
        return Msg.success().add("list",list);
    }

    /**
     * 根据状态获取信息列表
     * @param record
     * @return
     */
    @RequestMapping(value = "/getEnterStuByState",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByState(EnterpriseStudent record){
        List<EnterpriseStudent> list = enterpriseStudentService.getByState(record);
        return Msg.success().add("list",list);
    }


    /**
     * 学生查看签约信息
     * @param session
     * @return
     */
    @RequestMapping(value = "/getEnterStuByStudentId",method = RequestMethod.POST)
    @ResponseBody
    public Msg getByStudentId(HttpSession session){
        Integer studentid = (Integer) session.getAttribute("studentid");
        List<EnterpriseStudent> list = enterpriseStudentService.getByStudentId(studentid);
        return Msg.success().add("list",list);
    }



}
