package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Student;
import com.zstu.manage.dao.StudentDao;
import com.zstu.manage.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;


    @Override
    public Boolean add(Student student) {
        studentDao.insertSelective(student);
        return true;
    }

    @Override
    public Boolean update(Student student) {
        studentDao.updateByPrimaryKeySelective(student);
        return true;
    }

    @Override
    public Student getByStudentNumber(Student student) {
        return studentDao.getByStuNum(student);
    }



    @Override
    public Student getById(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }
}
