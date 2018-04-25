package com.zstu.manage.service.impl;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.dao.ResumeJobDao;
import com.zstu.manage.service.ResumeJobService;
import com.zstu.manage.vo.Param;
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
       resumeJobDao.insertSelective(record);
       return true;
    }

    @Override
    public Boolean update(ResumeJob record) {
       resumeJobDao.updateByPrimaryKeySelective(record);
       return true;
    }

    @Override
    public Boolean delete(Integer id) {
        resumeJobDao.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public List<ResumeJob> getByStudentId(Integer studentId) {
        return resumeJobDao.getByStudentId(studentId);
    }

    @Override
    public List getByEnterpriseId(Integer EnterpriseId) {
        return resumeJobDao.getByEnterpriseId(EnterpriseId);
    }

    @Override
    public List<ResumeJob> getAll() {
        return resumeJobDao.getAll();
    }

    @Override
    public List getByJobNameAndEnterprise(Param param) {
        return null;
    }
}
