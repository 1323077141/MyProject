package com.zstu.manage.service.impl;

import com.zstu.manage.bean.EnterpriseStudent;
import com.zstu.manage.dao.EnterpriseStudentDao;
import com.zstu.manage.service.EnterpriseStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
@Service
public class EnterpriseStudentServiceImpl implements EnterpriseStudentService{

    @Resource
    private EnterpriseStudentDao enterpriseStudentDao;

    public List<EnterpriseStudent> getAll(){
        return enterpriseStudentDao.getAll();
    }

    public List<EnterpriseStudent> getByStudentId(Integer id){
        return enterpriseStudentDao.getByStudentId(id);
    }

    public Boolean update(EnterpriseStudent record){
        int n = enterpriseStudentDao.updateByPrimaryKeySelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean insert(EnterpriseStudent record){
        int n = enterpriseStudentDao.insertSelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean delete(Integer id){
        int n = enterpriseStudentDao.deleteByPrimaryKey(id);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

}
