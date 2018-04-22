package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Manager;
import com.zstu.manage.dao.ManagerDao;
import com.zstu.manage.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService{
    @Resource
    private ManagerDao managerDao;

    public Manager selectByName(Manager record){
        return managerDao.selectByName(record);
    }

    public Boolean update(Manager record){
        int n = 0;
        n = managerDao.updateByPrimaryKeySelective(record);
        if(n > 0){
            return true;
        }
        return false;
    }
}
