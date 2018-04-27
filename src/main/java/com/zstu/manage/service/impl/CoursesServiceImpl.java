package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Courses;
import com.zstu.manage.dao.CoursesDao;
import com.zstu.manage.service.CoursesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {
    @Resource
    private CoursesDao coursesDao;

    @Override
    public Courses getByName(Courses record) {
        return coursesDao.getByName(record);
    }

    @Override
    public Boolean insert(Courses record){
        coursesDao.insertSelective(record);
        return true;
    }

    @Override
    public Boolean update(Courses record) {
        coursesDao.updateByPrimaryKeySelective(record);
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        coursesDao.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public List<Courses> getAll() {
        return coursesDao.getAll();
    }

}
