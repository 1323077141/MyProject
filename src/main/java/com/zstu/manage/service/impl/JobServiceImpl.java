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

}
