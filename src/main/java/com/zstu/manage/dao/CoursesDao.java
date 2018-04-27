package com.zstu.manage.dao;

import com.zstu.manage.bean.Courses;

import java.util.List;

public interface CoursesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Courses record);

    int insertSelective(Courses record);

    Courses selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Courses record);

    int updateByPrimaryKey(Courses record);

    List<Courses> getAll();

    Courses getByName(Courses record);
}