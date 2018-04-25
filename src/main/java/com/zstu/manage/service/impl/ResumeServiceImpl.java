package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Resume;
import com.zstu.manage.dao.ResumeDao;
import com.zstu.manage.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
@Service
public class ResumeServiceImpl implements ResumeService{
    @Resource
    private ResumeDao resumeDao;

    public List<Resume> getByStudentId(Integer studentId){
        return resumeDao.getByStudentId(studentId);
    }

    public Boolean add(Resume resume){
       resumeDao.insertSelective(resume);
       return true;
    }

    public Boolean delete(Integer id){
        resumeDao.deleteByPrimaryKey(id);
        return true;
    }

    public Boolean update(Resume resume){
        resumeDao.updateByPrimaryKeySelective(resume);
        return true;
    }

    public Resume getByResumeId(Integer id){
       return resumeDao.selectByPrimaryKey(id);
    }

}
