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
        int n = resumeDao.insertSelective(resume);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean delete(Integer id){
        int n = resumeDao.deleteByPrimaryKey(id);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean update(Resume resume){
        int n = resumeDao.updateByPrimaryKeySelective(resume);
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }

    public Resume getByResumeId(Integer id){
       return resumeDao.selectByPrimaryKey(id);
    }

}
