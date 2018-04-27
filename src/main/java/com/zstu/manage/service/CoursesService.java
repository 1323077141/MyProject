package com.zstu.manage.service;

import com.zstu.manage.bean.Courses;

import java.util.List;

public interface CoursesService {
    Courses getByName(Courses record);
    Boolean insert(Courses record);
    Boolean update(Courses record);
    Boolean delete(Integer id);
    List<Courses> getAll();

}
