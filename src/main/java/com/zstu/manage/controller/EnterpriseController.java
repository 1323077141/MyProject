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
import java.util.List;

@Controller
public class EnterpriseController {
    @Resource
    private EnterpriseService enterpriseService;

    /**
     * 登录
     * @param record
     * @param session
     * @return
     */
    @RequestMapping(value = "/loginEnter",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(Enterprise record,HttpSession session){
        Enterprise enterprise = enterpriseService.login(record);
        if(enterprise != null){
            if(enterprise.getPassword().equals(record.getPassword()) &&enterprise.getState() == 1){
                session.setAttribute("enterpriseNumber",enterprise.getEnterprisenumber());
                session.setAttribute("enterpriseId",enterprise.getId());
                return Msg.success().add("enterprise",enterprise);
            }
        }
        return Msg.fail().add("enterprise",enterprise);
    }

    /**
     * 注册
     * @param record
     * @return
     */
    @RequestMapping(value = "/registerEnter",method = RequestMethod.POST)
    @ResponseBody
    public Msg Register(Enterprise record){
        if(enterpriseService.register(record)){
            return Msg.success().add("record",record);
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/updateEnter", method = RequestMethod.POST)
    @ResponseBody
    public Msg CheckOut(Enterprise record){
        if(record == null){
            return Msg.fail();
        }
        if(enterpriseService.update(record)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    @RequestMapping("/getAllEnter")
    @ResponseBody
    public Msg getAll(){
        List<Enterprise> list = enterpriseService.getAll();
        return Msg.success().add("list",list);
    }

    @RequestMapping(value = "/deleteEnter",method = RequestMethod.POST)
    @ResponseBody
    public Msg Delete(Integer id){
        if(enterpriseService.delete(id)){
            return Msg.success();
        }
        return Msg.fail();
    }

}
