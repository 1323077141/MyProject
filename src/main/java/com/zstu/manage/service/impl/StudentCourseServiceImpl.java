package com.zstu.manage.service.impl;

import com.zstu.manage.bean.StudentCourses;
import com.zstu.manage.dao.StudentCoursesDao;
import com.zstu.manage.service.StudentCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    @Resource
    private StudentCoursesDao studentCoursesDao;

    @Override
    public Boolean add(StudentCourses record) {
        studentCoursesDao.insertSelective(record);
        return true;
    }

    @Override
    public List getByStudentId(Integer studentid) {
        return studentCoursesDao.getByStudentId(studentid);
    }
}
