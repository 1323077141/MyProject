package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Enterprise;
import com.zstu.manage.dao.EnterpriseDao;
import com.zstu.manage.service.EnterpriseService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Resource
    EnterpriseDao enterpriseDao;

    public Msg login(Enterprise record){
        Enterprise enterprise = enterpriseDao.selectByEnterpriseNumber(record);
        if(enterprise != null){
            if(record.getPassword().equals(enterprise.getPassword()) && enterprise.getState() == 1){
                return Msg.success().add("enterprise",enterprise);
            }

        }
        return null;
    }

    public Boolean register(Enterprise record){
        int n = 0;
        n = enterpriseDao.insertSelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

}
