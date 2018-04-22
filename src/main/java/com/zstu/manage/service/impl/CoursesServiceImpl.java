package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Courses;
import com.zstu.manage.dao.CoursesDao;
import com.zstu.manage.service.CoursesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CoursesServiceImpl implements CoursesService {
    @Resource
    private CoursesDao coursesDao;

    public Boolean insert(Courses record){
        int n  = coursesDao.insertSelective(record);
        if(n > 0){
            return true;
        }
        return false;
    }

}
