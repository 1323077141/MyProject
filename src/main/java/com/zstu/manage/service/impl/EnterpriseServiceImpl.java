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

    public Enterprise login(Enterprise record){
        return null;
    }

}
