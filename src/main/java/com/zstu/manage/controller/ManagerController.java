package com.zstu.manage.controller;

import com.zstu.manage.bean.Manager;
import com.zstu.manage.service.ManagerService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018-04-19.
 */
@Controller
public class ManagerController {

    @Resource
    private ManagerService managerService;

    /**
     * 登录
     * @param record
     * @param session
     * @return
     */
    @RequestMapping(value = "/loginMan",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(Manager record,HttpSession session){
        Manager manager = managerService.selectByName(record);
        if(manager != null){
            if(manager.getPassword().equals(record.getPassword())){
                session.setAttribute("managername",manager.getManagername());
                session.setAttribute("managerid",manager.getId());
                return Msg.success().add("manager",manager);
            }
        }
        return Msg.fail();
    }

    /**
     * 修改密码
     * @param manager
     * @return
     */
    @RequestMapping(value = "/updateMan",method = RequestMethod.POST)
    @ResponseBody
    public Msg update(Manager manager){
        if(managerService.update(manager)){
            return Msg.success();
        }
        return Msg.fail();
    }


}
