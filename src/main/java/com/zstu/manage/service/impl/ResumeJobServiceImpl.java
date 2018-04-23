package com.zstu.manage.service.impl;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.dao.ResumeJobDao;
import com.zstu.manage.service.ResumeJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
@Service
public class ResumeJobServiceImpl implements ResumeJobService {
    @Resource
    private ResumeJobDao resumeJobDao;

    @Override
    public Boolean add(ResumeJob record) {
        int n = resumeJobDao.insertSelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean update(ResumeJob record) {
        int n = resumeJobDao.updateByPrimaryKeySelective(record);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean delete(Integer id) {
        int n = resumeJobDao.deleteByPrimaryKey(id);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<ResumeJob> getByStudentId(Integer studentId) {
        return null;
    }

    @Override
    public List<ResumeJob> getByEnterpriseId(Integer EnterpriseId) {
        return null;
    }

    @Override
    public List<ResumeJob> getAll() {
        return resumeJobDao.getAll();
    }

    @Override
    public List<ResumeJob> getByJobNameAndEnterprise(ResumeJob record) {
        return null;
    }
}
