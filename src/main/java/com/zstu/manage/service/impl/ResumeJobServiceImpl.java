package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Resume;
import com.zstu.manage.service.ResumeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
@Service
public class ResumeJobServiceImpl implements ResumeService{
    @Override
    public List<Resume> getByStudentId(Integer studentId) {
        return null;
    }

    @Override
    public Resume getByResumeId(Integer id) {
        return null;
    }

    @Override
    public Boolean add(Resume resume) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean update(Resume resume) {
        return null;
    }
}
