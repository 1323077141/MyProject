package com.zstu.manage.controller;
import com.zstu.manage.bean.Enterprise;
import com.zstu.manage.service.EnterpriseService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller("/enterprise")
public class EnterpriseController {
    @Resource
    private EnterpriseService enterpriseService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(Enterprise record,HttpSession session){
        Enterprise enterprise = enterpriseService.login(record);
        if(enterprise != null){
            session.setAttribute("enterpriseNumber",enterprise.getEnterprisenumber());
            session.setAttribute("enterpriseId",enterprise.getId());
            return Msg.success().add("enterprise",enterprise);
        }else{
            return Msg.fail().add("enterprise",enterprise);
        }
    }

}
