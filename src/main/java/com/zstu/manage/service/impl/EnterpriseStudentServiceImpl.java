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
        enterpriseStudentDao.updateByPrimaryKeySelective(record);
        return true;
    }

    public Boolean insert(EnterpriseStudent record){
        enterpriseStudentDao.insertSelective(record);
        return true;
    }

    public Boolean delete(Integer id){
       enterpriseStudentDao.deleteByPrimaryKey(id);
       return true;
    }

    public List<EnterpriseStudent> getByState(EnterpriseStudent record){
        return enterpriseStudentDao.getByState(record);
    }

}
