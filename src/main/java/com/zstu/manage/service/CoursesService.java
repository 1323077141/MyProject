package com.zstu.manage.service;

import com.zstu.manage.bean.Courses;

import java.util.List;

public interface CoursesService {
    Boolean insert(Courses record);
    Boolean update(Courses record);
    Boolean delete(Integer id);
    List<Courses> getAll();

}
