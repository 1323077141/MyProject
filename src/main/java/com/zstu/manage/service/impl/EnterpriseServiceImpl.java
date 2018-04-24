package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Enterprise;
import com.zstu.manage.dao.EnterpriseDao;
import com.zstu.manage.service.EnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Resource
    EnterpriseDao enterpriseDao;

    public Enterprise login(Enterprise record){
        Enterprise enterprise = enterpriseDao.selectByEnterpriseNumber(record);
        return enterprise;
    }

    public Enterprise getByName(Enterprise record){
        Enterprise enterprise = enterpriseDao.getByEnterpriseName(record);
        return enterprise;
    }

    public Boolean register(Enterprise record){
        record.setEnterprisenumber("qy" + UUID.randomUUID().toString().split("-")[0]);
        int n = enterpriseDao.insertSelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean update(Enterprise record){
        int n = enterpriseDao.updateByPrimaryKeySelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public List<Enterprise> getAll(){
        return enterpriseDao.selectAll();
    }

    public Boolean delete(Integer id){
        int n = enterpriseDao.deleteByPrimaryKey(id);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }
}
