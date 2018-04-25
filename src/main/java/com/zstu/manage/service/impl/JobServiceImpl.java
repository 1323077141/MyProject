package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Job;
import com.zstu.manage.dao.JobDao;
import com.zstu.manage.service.JobService;
import com.zstu.manage.util.Msg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Resource
    private JobDao jobDao;

    public List<Job> getAll(){
       return jobDao.getAll();
    }

    public List<Job> getByName(Job job){
        return jobDao.getByName(job);
    }

    public List<Job> getByEnterprise(Job job){
        return jobDao.getAllByEnter(job);
    }

    public Boolean update(Job job){
        jobDao.updateByPrimaryKeySelective(job);
        return true;
    }

    public Boolean insert(Job job){
        jobDao.insertSelective(job);
        return true;
    }

    public Boolean delete(Integer id){
        jobDao.deleteByPrimaryKey(id);
        return true;
    }

}
